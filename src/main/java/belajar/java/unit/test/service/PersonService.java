package belajar.java.unit.test.service;

import belajar.java.unit.test.model.Person;
import belajar.java.unit.test.repository.PersonRepository;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        Person person = personRepository.selectById(id);
        if (person != null)
            return person;
        else
            throw new IllegalArgumentException("person not found!");
    }
}
