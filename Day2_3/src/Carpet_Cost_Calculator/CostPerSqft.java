package Carpet_Cost_Calculator;

import java.util.HashMap;

public class CostPerSqft extends CurrencyExchange{
    private String material;
    private CurrencyExchange currencyExchange;
    HashMap<String, Double> materialMap = new HashMap<>();

    public CostPerSqft(String materials, CurrencyExchange currencyExchange) {
        super(currencyExchange.location);
        this.currencyExchange = currencyExchange;
        this.material = materials;
//        Default Prices of Material wrt the Local Currency at the HQ.
        materialMap.put("nylon", 10.00);
        materialMap.put("triexta", 12.50);
        materialMap.put("polyester", 15.00 );
        materialMap.put("wool", 17.50);
        materialMap.put("olefin", 7.50);
    }

    public HashMap<String, Double> materialCost() {
        HashMap<String, Double> costMap = new HashMap<>();
        for (var entry : currencyExchange.currencyValues().entrySet()) {
            costMap.put(entry.getKey(), entry.getValue() * materialMap.get(material));
        }
        return costMap;
    }
}
