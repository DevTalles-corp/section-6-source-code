package com.devtalles.estructurasdedatos.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();
        cities.add("Buenos Aires");
        cities.add("Paris");
        cities.add("New York");

        ((LinkedList<String>)cities).addFirst("london");
        ((LinkedList<String>)cities).addLast("Berlin");

        System.out.println(cities.get(2));

        System.out.println(cities);

        System.out.println(cities.set(2, "Madrid"));

        System.out.println(cities.remove("Paris"));

        ((LinkedList<String>)cities).removeFirst();
        ((LinkedList<String>)cities).removeLast();

        String searchCity = "Buenos Aires";

        if (cities.contains(searchCity)){
            System.out.println("Está en la lista");
        }else{
            System.out.println("No está en la lista");
        }

        for (String city: cities){
            System.out.println("- " + city);
        }

    }
}
