package ORMUsage.datasource;

import jakarta.persistence.*;

public class MariaDbConnection {
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static synchronized EntityManager getInstance() {
        if (em == null) {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("CurrencyMariaDbUnit");
            }
            em = emf.createEntityManager();
        }

        return em;
    }

    public static boolean testConnection() {
        try {
            EntityManager em = getInstance();
            em.createNativeQuery("SELECT 1").getSingleResult();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
