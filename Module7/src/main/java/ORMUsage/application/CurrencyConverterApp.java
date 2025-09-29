package ORMUsage.application;

import ORMUsage.view.ConverterView;
import ORMUsage.service.CurrencySeeder;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        CurrencySeeder.seed(); // seed default currencies, since the db gets initially dropped

        ConverterView.launch(ConverterView.class);
    }
}
