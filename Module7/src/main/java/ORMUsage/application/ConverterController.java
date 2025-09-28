package ORMUsage.application;

import ORMUsage.dao.CurrencyDao;
import ORMUsage.entity.Currency;
import ORMUsage.service.CurrencyRateService;
import ORMUsage.view.ConverterView;
import ORMUsage.datasource.MariaDbConnection;

import java.util.List;

public class ConverterController {
    private CurrencyDao dao = new CurrencyDao();
    private CurrencyRateService rateService = new CurrencyRateService(dao);
    private ConverterView view;

    public ConverterController(ConverterView view) {
        this.view = view;
    }

    public void initialize() {
        if (MariaDbConnection.getInstance() == null) {
            this.view.showError("Cannot connect to the database.");
            return;
        }

        List<Currency> currencies = this.dao.findAll();
        this.view.populateCurrencies(currencies);
        this.view.showInstructions("Enter an amount, choose source and target currencies, then press Convert.");
    }

    public void onConvert(double amount, Currency from, Currency to) {
        this.view.clearMessage();

        if (from == null || to == null) {
            this.view.showError("Please select both source and target currencies.");
            return;
        }

        // get (and set) rates to cache
        double fromRate = this.rateService.getRateToEur(from.getCode());
        double toRate = this.rateService.getRateToEur(to.getCode());

        // conversion
        double eur = amount * fromRate;
        double result = toRate == 0 ? 0.0 : eur / toRate;

        this.view.showResult(result);
    }

    public boolean recordExists(String code) {
        try {
            Currency currency = this.dao.findByCode(code);
            return currency != null;
        } catch (Exception e) {
            return false;
        }
    }

    // only addition supported for now, no update or deletion
    public void addCurrency(String code, String name, double rateToEur) {
        Currency currency = new Currency(code, name, rateToEur);
        this.dao.persist(currency);
        List<Currency> currencies = this.dao.findAll();
        this.view.populateCurrencies(currencies); // refresh the currency lists
    }
}
