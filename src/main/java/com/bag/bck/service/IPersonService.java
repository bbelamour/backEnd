package com.bag.bck.service;

import com.bag.bck.models.Person;

import java.util.List;


public interface IPersonService {

    public List<Person> seePerson();
    public void addPerson (Person pers);
    public void deletePerson(Long id);
    public Person findPerson(Long id);

    public void editPerson(Person pers);

}
