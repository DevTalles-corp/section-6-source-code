package com.devtalles.estructurasdedatos.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new TreeMap<>();

        productPrices.put("Laptop", 1200);
        productPrices.put("Smartphone", 1000);
        productPrices.put("Tablet", 1500);
        productPrices.put("Mouse", 1500);
        productPrices.put("Keyboard", 1500);

        System.out.println(productPrices);

        System.out.println(productPrices.get("Laptop"));

        productPrices.put("Tablet", 1234);

        System.out.println(productPrices);

        productPrices.remove("Laptop");

        System.out.println(productPrices);
    }
}
