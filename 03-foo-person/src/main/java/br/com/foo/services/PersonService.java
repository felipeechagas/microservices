package br.com.foo.services;

import br.com.foo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

  //Simulador de id no banco de dados
  private final AtomicLong counter = new AtomicLong();

  public Person create(Person person){
    return person;
  }

  public Person update(Person person){
    return person;
  }

  public void delete(String id){

  }

  public Person findById(String id){
    Person person = new Person();
    person.setId(counter.incrementAndGet());
    person.setFirstName("Felipe");
    person.setLastName("Chagas");
    person.setAddress("Moreno - Pernambuco - Brasil");
    person.setGender("Male");
    return person;
  }

  //Retorna lista de persons
  public List<Person> findAll(){
    List<Person> persons = new ArrayList<Person>();
    for (int i = 0; i < 8; i++){
      Person person = mockPerson(i);
      persons.add(person);
    }
    return persons;
  }

  private Person mockPerson(int i) {
    Person person = new Person();
    person.setId(counter.incrementAndGet());
    person.setFirstName("Person name " + i);
    person.setLastName("Last name " + i);
    person.setAddress("Some address in Brasil " + i);
    person.setGender("Male");
    return person;
  }
}
