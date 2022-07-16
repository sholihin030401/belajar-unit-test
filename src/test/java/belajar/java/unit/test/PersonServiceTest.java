package belajar.java.unit.test;

import belajar.java.unit.test.model.Person;
import belajar.java.unit.test.repository.PersonRepository;
import belajar.java.unit.test.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        Mockito.when(personRepository.selectById("ichwan")).thenReturn(new Person("ichwan","Ichwan"));

        var person = personService.get("ichwan");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("ichwan",person.getId());
        Assertions.assertEquals("Ichwan",person.getName());
    }
}
