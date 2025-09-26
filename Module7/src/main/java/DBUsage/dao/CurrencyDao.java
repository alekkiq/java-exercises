package DBUsage.dao;

import DBUsage.entity.Currency;
import java.sql.*;
import DBUsage.datasource.MariaDbConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class CurrencyDao {
    public Map<String, Double> currencyCache = new HashMap<>();

    public boolean testConnection() {
        try (Connection conn = MariaDbConnection.getConn()) {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            System.out.println("Connection test failed: " + e.getMessage());
            return false;
        }
    }

    public List<Currency> getAllCurrencies() {
        List<Currency> currencies = new ArrayList<>();
        String query = "SELECT code, name, rate_to_eur FROM currency";

        try (Connection conn = MariaDbConnection.getConn();
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query)) {

            while (rs.next()) {
                String code = rs.getString("code");
                String name = rs.getString("name");
                double rateToEuro = rs.getDouble("rate_to_eur");
                currencies.add(new Currency(code, name, rateToEuro));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching currencies: " + e.getMessage());
        }

        return currencies;
    }

    // this method is not really needed in this version
    // since the rates are fetched in bulk in getAllCurrencies()
    // and stored in the Currency objects,
    // but it demonstrates fetching of individual rates
    // and was part of the assignment requirements
    public double getCurrencyExchangeRate(String code) {
        if (this.currencyCache.containsKey(code)) {
            System.out.println("Found rate for " + code + " in cache");
            return this.currencyCache.get(code);
        }

        String sql = "SELECT rate_to_eur FROM currency WHERE code=?";
        double rateToEuro = 1.0;

        try (Connection conn = MariaDbConnection.getConn();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, code);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    rateToEuro = rs.getDouble("rate_to_eur");
                    this.currencyCache.put(code, rateToEuro);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error fetching currency: " + e.getMessage());
        }

        return rateToEuro;
    }
}
