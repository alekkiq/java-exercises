package DBUsage.application;

import DBUsage.dao.CurrencyDao;
import DBUsage.entity.Currency;
import DBUsage.view.ConverterView;
import ORMUsage.dao.TransactionDao;

import java.util.List;

public class ConverterController {
    private CurrencyDao dao = new CurrencyDao();
    private ConverterView view;

    public ConverterController(ConverterView view) {
        this.view = view;
    }

    public void initialize() {
        // try to connect to the database and show error if it fails
        if (!this.dao.testConnection()) {
            this.view.showError("Cannot connect to the database.");
            return;
        }

        List<Currency> currencies = this.dao.getAllCurrencies();
        this.view.populateCurrencies(currencies);
        this.view.showInstructions("Enter an amount, choose source and target currencies, then press Convert.");
    }

    public void onConvert(double amount, Currency from, Currency to) {
        this.view.clearMessage();

        if (from == null || to == null) {
            this.view.showError("Please select both source and target currencies.");
            return;
        }

        double eur = amount * this.dao.getCurrencyExchangeRate(from.getCode());
        double result = eur / this.dao.getCurrencyExchangeRate(to.getCode());

        this.view.showResult(result);
    }
}
