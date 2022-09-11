package com.bag.bck.service;

import com.bag.bck.models.Person;
import com.bag.bck.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService implements IPersonService{

    @Autowired
    public PersonRepository personRepo;

    @Override
    public List<Person> seePerson() {
        return personRepo.findAll();
    }

    @Override
    public void addPerson(Person pers) {
        personRepo.save(pers);
    }

    @Override
    public void deletePerson(Long id) {
        personRepo.deleteById(id);
    }

    @Override
    public Person findPerson(Long id) {
        return personRepo.findById(id).orElse(null);

    }
    @Override
    public void editPerson(Person pers) {
        personRepo.save(pers);

    }
}
