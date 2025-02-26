package com.devtalles.estructurasdedatos.equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass())return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan");
        Person person2 = new Person("Maria");

        System.out.println(person2.equals(person1));
    }
}
