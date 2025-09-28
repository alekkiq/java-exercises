package ORMUsage.dao;

import ORMUsage.entity.Currency;
import ORMUsage.datasource.MariaDbConnection;

import jakarta.persistence.EntityManager;
import java.util.List;

public class CurrencyDao {
    public Currency find(int id) {
        EntityManager em = MariaDbConnection.getInstance();
        return em.find(Currency.class, id);
    }

    public Currency findByCode(String code) {
        EntityManager em = MariaDbConnection.getInstance();
        return em.createQuery("SELECT c FROM Currency c WHERE c.code = :code", Currency.class)
                .setParameter("code", code)
                .getSingleResult();
    }

    public double getCurrencyExchangeRate(String code) {
        EntityManager em = MariaDbConnection.getInstance();
        Currency currency = em.createQuery("SELECT c FROM Currency c WHERE c.code = :code", Currency.class)
                          .setParameter("code", code)
                          .getSingleResult();
        return currency != null ? currency.getRateToEur() : 0.0;
    }

    public List<Currency> findAll() {
        EntityManager em = MariaDbConnection.getInstance();
        return em.createQuery("SELECT c FROM Currency c", Currency.class).getResultList();
    }

    public void persist(Currency c) {
        EntityManager em = MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }

    public void update(Currency c) {
        EntityManager em = MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
    }

    public void delete(Currency c) {
        EntityManager em = MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.remove(em.contains(c) ? c : em.merge(c));
        em.getTransaction().commit();
    }
}
