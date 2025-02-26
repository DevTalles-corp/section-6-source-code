package com.devtalles.estructurasdedatos.set.treeset;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person>{
    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        Person person1 = new Person("Maria", "123");
        Person person2 = new Person("Ana", "456");
        Person person3 = new Person("Ana2", "4567");
        Person person5 = new Person("Maria2", "1234");

        //create
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person5);

        //read or list
        System.out.println(persons);

        for (Person person: persons){
            if(person!=null) System.out.println(person.name);
        }

        //delete
        persons.remove(person2);

        System.out.println(persons);

        //update
        persons.add(person3);

        System.out.println(persons);

        System.out.println(persons.contains(person3));
    }

    @Override
    public int compareTo(Person o) {
        return this.dni.compareTo(o.dni);
    }
}
