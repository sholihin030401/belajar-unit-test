package belajar.java.unit.test.repository;

import belajar.java.unit.test.model.Person;

public interface PersonRepository {

    Person selectById(String id);

    void insert(Person person);
}
