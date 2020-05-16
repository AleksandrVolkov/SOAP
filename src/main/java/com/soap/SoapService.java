package com.soap;

import com.entity.Person;
import com.entity.Repository;
import services.all.*;

import java.util.ArrayList;
import java.util.List;

public class SoapService implements com.soap.SoapServiceSkeletonInterface {

    public GetPersonsByAgeResponseDocument getPersonsByAge(GetPersonsByAgeDocument getHumansByAge) {
        int age = getHumansByAge.getGetPersonsByAge().getAge();

        List<services.all.Person> humans = new ArrayList<>();
        Repository repository = new Repository();
        services.all.Repository list = services.all.Repository.Factory.newInstance();
        List<Person> personsList = repository.findByAge(age);

        for(Person person : personsList)
        {
            services.all.Person humanInst = services.all.Person.Factory.newInstance();
            humanInst.setHumanId(person.getId());
            humanInst.setAge(person.getAge());
            humanInst.setName(person.getName());
            humans.add(humanInst);
        }

        list.setPersonArray((services.all.Person[])humans.toArray());
        GetPersonsByAgeResponseDocument humansResponseDocument = GetPersonsByAgeResponseDocument.Factory.newInstance();
        GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse humansResponse = GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse.Factory.newInstance();
        humansResponse.setReturn(list);
        humansResponseDocument.setGetPersonsByAgeResponse(humansResponse);
        return humansResponseDocument;
    }



    public GetPersonResponseDocument getPerson(GetPersonDocument getHuman) {
        int id = getHuman.getGetPerson().getHumanId();

        Repository repository = new Repository();

        services.all.Person human1 = services.all.Person.Factory.newInstance();
        Person person2 = repository.findById(id);

        if(person2 == null)
            return null;

        human1.setAge(person2.getAge());
        human1.setName(person2.getName());

        GetPersonResponseDocument humanResponseDocument = GetPersonResponseDocument.Factory.newInstance();
        GetPersonResponseDocument.GetPersonResponse humanResponse = GetPersonResponseDocument.GetPersonResponse.Factory.newInstance();
        humanResponse.setReturn(human1);
        humanResponseDocument.setGetPersonResponse(humanResponse);

        return humanResponseDocument;
    }
}
