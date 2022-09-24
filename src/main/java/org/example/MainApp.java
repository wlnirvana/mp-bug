package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
public class MainApp {
  public MainApp(PersonService personService) {
    this.personService = personService;
  }

  public static void main(String[] args) {
    SpringApplication.run(MainApp.class, args);
  }



  private final PersonService personService;

  @GetMapping("/saveBatch")
  List<Integer> saveBatch() {
    var persons = List.of(
        new Person("Alice"),
        new Person("Bob"),
        new Person("Chris")
    );
    personService.saveBatch(persons);
    return persons.stream().map(Person::getId).collect(Collectors.toList());
  }

  @GetMapping("/saveOneByOne")
  List<Integer> saveOneByOne() {
    var persons = List.of(
        new Person("Alice"),
        new Person("Bob"),
        new Person("Chris")
    );
    persons.forEach(personService::save);
    return persons.stream().map(Person::getId).collect(Collectors.toList());
  }
}
