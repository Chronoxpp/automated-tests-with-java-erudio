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
  Person expected;

  IPersonService service;

  @BeforeEach
  void setUp()
  {
    service = new PersonService();

    expected = new Person(
      "Lucas",
      "Dourado",
      "lucas@gmail.com",
      "Rondonópolis - MT - Brasil",
      "Male"
    );
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
      () -> assertNotNull(actual.getId(), () -> "Created person should have a id"),
      () -> assertEquals(expected.getFirstName(), actual.getFirstName(), () -> "Created person should have first name as " + expected.getFirstName()),
      () -> assertEquals(expected.getLastName(), actual.getLastName(), () -> "Created person should have last name as " + expected.getLastName()),
      () -> assertEquals(expected.getEmail(), actual.getEmail(), () -> "Created person should have email as " + expected.getEmail()),
      () -> assertEquals(expected.getAddress(), actual.getAddress(), () -> "Created person should have address as " + expected.getAddress()),
      () -> assertEquals(expected.getGender(), actual.getGender(), () -> "Created person should have gender as " + expected.getGender())
    );
  }

  @DisplayName("When Create a Person with null email Should Throw Exception")
  @Test
  void testCreatePeson_WhithNullEmail_ShouldThrowIllegalArgumentExceptionException()
  {
    expected.setEmail(null);

    IllegalArgumentException actualException;
    String expectedExceptionMessage = "The person email is null or empty";

    actualException = assertThrows(
      IllegalArgumentException.class,
      () -> service.createPerson(expected),
      () -> "Empty email should have cause an IllegalArgumentException"
    );

    assertTrue(
      actualException.getMessage().contains(expectedExceptionMessage),
      () -> "Exception should have a message: " + expectedExceptionMessage
    );
  }
}
