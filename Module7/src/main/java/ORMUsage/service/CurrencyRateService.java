package ORMUsage.service;

import ORMUsage.dao.CurrencyDao;
import java.util.Map;
import java.util.HashMap;

public class CurrencyRateService {
    private CurrencyDao currencyDao;
    private Map<String, Double> rateCache = new HashMap<>();

    public CurrencyRateService(CurrencyDao dao) {
        this.currencyDao = dao;
    }

    public double getRateToEur(String code) {
        if (code == null) return 0.0;

        if (this.rateCache.containsKey(code)) {
            return this.rateCache.get(code);
        } else {
            double rate = this.currencyDao.getCurrencyExchangeRate(code);
            this.rateCache.put(code, rate);
            return rate;
        }
    }

    public void clearCache() {
        this.rateCache.clear();
    }
}
