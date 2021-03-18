package com.spring.dao;

import com.spring.models.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

  private static int idCount;

  private List<Person> people;
  {
    people = new ArrayList<>();
    people.add(new Person(++idCount, "Oleg", 23, "Minsk"));
    people.add(new Person(++idCount, "Julia", 19, "Brest"));
    people.add(new Person(++idCount, "Maria", 34, "Vitebsk"));
    people.add(new Person(++idCount, "Valeria", 28, "Grodno"));
  }

  public List<Person> index() {
    return people;
  }

  public Person show(int id) {
    return people.stream().filter(p -> p.getId() == id)
        .findAny().orElse(new Person(1000, "Master Ioda"));
  }

  public void save(Person person) {
    person.setId(++idCount);
    people.add(person);
  }

  public void update(int id, Person person) {
    Person personForUpdate = show(id);
    personForUpdate.setName(person.getName());
    personForUpdate.setAge(person.getAge());
    personForUpdate.setAddress(person.getAddress());
  }

  public void delete(int id) {
    people.removeIf(person -> person.getId() == id);
  }
}
