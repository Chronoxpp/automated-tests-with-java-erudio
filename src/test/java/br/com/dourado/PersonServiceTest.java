package br.com.dourado;

import br.com.dourado.model.Person;
import br.com.dourado.service.IPersonService;
import br.com.dourado.service.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest
{
  Person person;

  IPersonService service;

  @BeforeEach
  void setUp()
  {
     service = new PersonService();
  }

  @DisplayName("When Create a Person With Success Should Return a Person With All Atributes")
  @Test
  void testCreatePerson_WhenSucess_ShouldReturnPersonWithAllValidAtributes()
  {
    Person expected = new Person(
      "Lucas",
      "Dourado",
      "lucas@gmail.com",
      "Rondonópolis - MT - Brasil",
      "Male"
    );

    Person actual = service.createPerson(expected);

    assertNotNull(
      actual,
      () -> "Created person should not be null"
    );

    assertAll(
      "Created person should contains all atributes as valid",
      () -> assertEquals(expected.getFirstName(), actual.getFirstName(), () -> "Created person should have first name as " + expected.getFirstName()),
      () -> assertEquals(expected.getLastName(), actual.getLastName(), () -> "Created person should have last name as " + expected.getLastName()),
      () -> assertEquals(expected.getEmail(), actual.getEmail(), () -> "Created person should have email as " + expected.getEmail()),
      () -> assertEquals(expected.getAddress(), actual.getAddress(), () -> "Created person should have address as " + expected.getAddress()),
      () -> assertEquals(expected.getGender(), actual.getGender(), () -> "Created person should have gender as " + expected.getGender())
    );
  }
}
