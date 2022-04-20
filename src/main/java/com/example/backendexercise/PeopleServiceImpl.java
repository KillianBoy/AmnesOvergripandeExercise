package com.example.backendexercise;


import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
@Service
@NoArgsConstructor
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleDao peopleDao;

    @Override
    public void savePeople(People people) {

        peopleDao.save(people);
    }

    public People getPeopleById(Integer id){
        return peopleDao.getPeopleById(id).orElseThrow(() -> new EntityNotFoundException("person not found"));
    }
}
