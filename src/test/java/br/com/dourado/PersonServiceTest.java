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

  @BeforeEach
  void setUp()
  {
     person = new Person(
      "Lucas",
      "Dourado",
      "lucas@gmail.com",
      "Rondonópolis - MT - Brasil",
      "Male"
    );
  }

  @DisplayName("When Create a Person With Success Should Return a Person Object")
  @Test
  void testCreatePerson_WhenSucess_ShouldReturnPersonObject()
  {
    IPersonService service = new PersonService();

    Person actual = service.createPerson(person);

    assertNotNull(
      actual,
      () -> "The createPerson should not have returned null!"
    );
  }

  @DisplayName("When Create a Person With Success Should Contains First Name in Returned Person")
  @Test
  void testCreatePerson_WhenSucess_ShouldContainsFirstNameInReturnedPerson()
  {
    IPersonService service = new PersonService();

    Person actual = service.createPerson(person);

    assertEquals(
      person.getFirstName(),
      actual.getFirstName(),
      () -> "The created person should have first name as " + person.getFirstName()
    );
  }
}
