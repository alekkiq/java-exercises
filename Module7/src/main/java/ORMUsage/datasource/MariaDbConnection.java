package ORMUsage.datasource;

import jakarta.persistence.*;

public class MariaDbConnection {
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static synchronized EntityManager getInstance() {
        try {
            if (em == null) {
                if (emf == null) {
                    emf = Persistence.createEntityManagerFactory("CurrencyMariaDbUnit");
                }
                em = emf.createEntityManager();
            }
        } catch (Exception e) { // connection failed -> set both as null
            em = null;
            emf = null;
        }

        return em;
    }
}
