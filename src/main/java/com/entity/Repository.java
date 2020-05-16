package com.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {

    private List<Person> personList;

    public Repository() {
        personList = new ArrayList<>();
        personList.add(new Person(1, "Fernando", 20));
        personList.add(new Person(2, "Bob", 22));
        personList.add(new Person(3, "Andrey", 24));
        personList.add(new Person(4, "Hubert", 26));
        personList.add(new Person(5, "Rosalia" , 28));
        personList.add(new Person(6, "Bolling" , 30));
    }

    public Person findById(int id){
        List<Person> personsFilter = this.personList.stream().filter(person -> person.getId() == id)
                .collect(Collectors.toList());

        return personsFilter != null ? personsFilter.get(0) : null;
    }

    public List<Person> findByAge(int age){
        List<Person> personsFilter= this.personList.stream().filter(person -> person.getAge() == age)
                .collect(Collectors.toList());
        return personsFilter;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
