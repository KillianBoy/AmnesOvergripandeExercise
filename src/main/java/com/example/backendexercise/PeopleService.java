package com.example.backendexercise;

import org.springframework.beans.factory.annotation.Autowired;

public interface PeopleService {

    void savePeople(People people);


  /*  @Autowired
    PeopleDao peopleDao;

    public void insertPerson (People people) {
        peopleDao.insertPerson(people.getFirst_name(), people.getLast_name(), people.getBirth(), people.getAdress());

    }

    public People getPeopleById (String id){

        People people = peopleDao.getPeopleById(id);

        return people;
    }
}
*/
}
