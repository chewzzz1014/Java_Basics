package com.example.bealdung.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {
        Map<String, Product> productsByName = new HashMap<>();

        Product eBike = new Product("E-Bike", "A Bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");
        Product defaultProduct = new Product("Chocolate", "At least buy chocolate");

        // put
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);
        productsByName.put(null, defaultProduct); // null key allowed

        // get
        Product nextPurchase = productsByName.get("E-Bike");
        System.out.println(nextPurchase.getDescription());

        // remove
        productsByName.remove(null);

        // containsKey & containsValue
        System.out.println(productsByName.containsKey(null));
        System.out.println(productsByName.containsValue(eBike));

        // iterate
        // 1. by key
        for (String key : productsByName.keySet()) {
            Product product = productsByName.get(key);
        }
        // 2. by entries
        for (Map.Entry<String, Product> entry : productsByName.entrySet()) {
            Product product = entry.getValue();
            String key = entry.getKey();
        }
        // 3. by values
        List<Product> products = new ArrayList<>(productsByName.values());


        // to use Product as key, needs to provide implementation for equals() and hashCode()
        HashMap<Product, Integer> priceByProduct = new HashMap<>();
        priceByProduct.put(eBike, 900);


        // forEach
        productsByName.forEach( (k,v) -> {
            System.out.printf("Key: %s Product: %s\n", k, v.getDescription());
        });


        // getOrDefault
        Product chocolate = new Product("chocolate", "something sweet");
        Product defaultProduct2 = productsByName.getOrDefault("horse carriage", chocolate);
        Product bike = productsByName.getOrDefault("E-Bike", chocolate);


        // putIfAbsent: only if not yet a mapping for the given key
        productsByName.putIfAbsent("E-Bike", chocolate);


        // merge: modify the value for a given key if a mapping exists, or add a new value otherwise
        Product eBike2 = new Product("E-Bike", "A bike with a battery");
        eBike2.getTags().add("sport");
        productsByName.merge("E-Bike", eBike2, Product::addTagsOfOtherProduct);


        // compute
        productsByName.compute("E-Bike", (k, v) -> {
            if (v != null) return v.addTagsOfOtherProduct(eBike2);
            else return eBike2;
        });



    }
}
