package ORMUsage.dao;

import ORMUsage.entity.*;
import jakarta.persistence.EntityManager;
import ORMUsage.datasource.MariaDbConnection;

public class TransactionDao {
    public void persist(Transaction t) {
        EntityManager em = MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

    public Transaction find(int id) {
        EntityManager em = MariaDbConnection.getInstance();
        return em.find(Transaction.class, id);
    }
}
