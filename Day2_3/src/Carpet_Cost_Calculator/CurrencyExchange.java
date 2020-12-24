package Carpet_Cost_Calculator;

import java.util.HashMap;

public class CurrencyExchange {
    String location;
    HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
    HashMap<String, String> currencyToCountry = new HashMap<String, String>();
    public CurrencyExchange(String location) {
        this.location = location;
    }

    public HashMap<String, Double> currencyValues() {
        switch (location) {
            case "usd":
                exchangeValues.put("usd", 1.00);
                exchangeValues.put("inr", 0.014);
                exchangeValues.put("gbp", 1.36);
                exchangeValues.put("eur", 1.22);
                break;

            case "inr":
                exchangeValues.put("usd", 70.00);
                exchangeValues.put("inr", 1.00);
                exchangeValues.put("gbp", 99.97);
                exchangeValues.put("eur", 89.77);
                break;

            case "gbp":
                exchangeValues.put("usd", 0.74);
                exchangeValues.put("inr", 0.010);
                exchangeValues.put("gbp", 1.00);
                exchangeValues.put("eur", 0.90);
                break;

            case "eur":
                exchangeValues.put("usd", 0.82);
                exchangeValues.put("inr", 0.011);
                exchangeValues.put("gbp", 1.11);
                exchangeValues.put("eur", 1.00);
                break;

        }

        return exchangeValues;

    }

    public HashMap<String, String> currToCountry() {
        currencyToCountry.put("usd", "United States");
        currencyToCountry.put("inr", "India");
        currencyToCountry.put("eur", "Spain");
        currencyToCountry.put("gbp", "UK");

        return currencyToCountry;
    }

}
