package module_8_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getAge() {return this.age;}
    public String getName() {return this.name;}
    public String getCity() {return this.city;}

    @Override
    public String toString() {
        return name + " (" + age + " " + city + ")";
    }
}

public class SortAndFilter {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Aleksi", 20, "Vantaa"));
        persons.add(new Person("Mikko", 45, "Stockholm"));
        persons.add(new Person("Brad", 30, "New York"));
        persons.add(new Person("Reino", 10, "Helsinki"));

        System.out.println("Original: " + persons);

        persons.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        System.out.println("Sorted by age: " + persons);

        persons.removeIf((person) -> person.getCity().equals("New York"));

        System.out.println("Filter out New York: " + persons);
    }
}
