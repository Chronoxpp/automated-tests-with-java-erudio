package br.com.dourado.service;

import br.com.dourado.model.Person;

public class PersonService implements IPersonService
{

  @Override
  public Person createPerson(Person person)
  {
    return person;
  }
}
