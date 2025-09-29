package ORMUsage.service;

import ORMUsage.datasource.MariaDbConnection;
import ORMUsage.entity.Currency;
import ORMUsage.dao.CurrencyDao;
import jakarta.persistence.EntityManager;

public class CurrencySeeder {
    public static void seed() {
        EntityManager em = MariaDbConnection.getInstance();

        if (em == null) return; // skip

        Long existing = em.createQuery("select count(c) from Currency c", Long.class)
                        .getSingleResult();

        if (existing != 0) return;

        em.getTransaction().begin();
        try {
            // seeded records
            em.persist(new Currency("EUR", "Euro", 1.0));
            em.persist(new Currency("USD", "United States Dollar", 0.92));
            em.persist(new Currency("GBP", "British Pound", 1.18));
            em.persist(new Currency("JPY", "Japanese Yen", 0.0063));
            em.persist(new Currency("CAD", "Canadian Dollar", 0.68));
            em.persist(new Currency("AUD", "Australian Dollar", 0.61));
            em.persist(new Currency("CHF", "Swiss Franc", 1.03));
            em.persist(new Currency("SEK", "Swedish Krona", 0.087));
            em.persist(new Currency("NOK", "Norwegian Krone", 0.086));
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }
    }
}
