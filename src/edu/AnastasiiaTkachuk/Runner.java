package edu.AnastasiiaTkachuk;

import java.util.Optional;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        Optional<Person> maybeStudent = Stream.of(
                        new Person("Anton", "Antonov", 15),
                        new Person("Ivan", "Ivanov", 45),
                        new Person("Masha", "Mashovna", 23),
                        new Person("Katya", "Katevna", 89),
                        new Person("Dasha", "Dashevna", 34),
                        new Person("Georgiy", "Georgievich", 32)
                )
                .filter(person -> person.getFullName().length() < 15)
                .reduce((person, person2) -> person.getAge() > person2.getAge() ? person : person2);
        maybeStudent.ifPresent(System.out::println);
    }
}
