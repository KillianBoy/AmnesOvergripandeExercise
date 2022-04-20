package com.example.backendexercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BackendExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendExerciseApplication.class, args);


    }


    @Bean
    CommandLineRunner runner (PeopleService peopleService, PeopleDao peopleDao) {
       return args -> {
           peopleService.savePeople(new People(null, "Göran" , "Persson", "1898-31-04", "Göranperssonvägen 54"  ));

           System.out.println(peopleDao.getPeopleById(1).toString());
           System.out.println(peopleDao.getPeopleById(2).toString());
       };
    }



}
