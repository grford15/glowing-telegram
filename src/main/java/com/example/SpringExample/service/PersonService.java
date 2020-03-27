package com.example.SpringExample.service;

import com.example.SpringExample.dao.PersonDao;
import com.example.SpringExample.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
