package com.example.backendexercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BackendExerciseApplicationTests {

    @Autowired
    private PeopleServiceImpl peopleServiceImpl;

    @Test
    void shouldSavePeople() {
        People people = new People(
                null,
                "Göran",
                "Persson",
                "1898-31-04",
                "Göranperssonvägen 54"
        );
        assertEquals("Göran", people.getFirst_name());
        assertEquals("Persson", people.getLast_name());
        assertEquals("1898-31-04", people.getBirth());
        assertEquals("Göranperssonvägen 54", people.getAdress());



    }





}
