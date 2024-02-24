package org.example;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class javaStream {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        //Filter

        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

//        females.forEach(System.out::println);

        List<Person> ageSorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
//        ageSorted.forEach(System.out::println);

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);

//        System.out.println(allMatch);

        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 100);
//        System.out.println(anyMatch);

        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Abdul Qader"));
//        System.out.println(noneMatch);

//        people.stream()
//                .max(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);

//        people.stream()
//                .min(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);

// Group by Gender
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });

        Optional<String> oldestPerson = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestPerson.ifPresent(System.out::println);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Abdul Qader", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
