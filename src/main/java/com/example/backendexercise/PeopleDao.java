package com.example.backendexercise;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public interface PeopleDao extends JpaRepository<People, Integer> {
    Optional<People> getPeopleById(Integer id);


   /* private JdbcTemplate jdbcTemplate;

    public void insertPerson(String first_name, String last_name, Date birth, String adress) {

        String query = "INSERT INTO people (first_name, last_name, birth_date, adress) VALUES(?,?,?,?)";

        int result = jdbcTemplate.update(query, first_name, last_name, birth, adress);

    }

    public People getPeopleById(String id) {
        String query = "SELECT * FROM people WHERE people_id =?";

        People people = jdbcTemplate.queryForObject(query, new RowMapper<People>() {
            @Override
            public People mapRow(ResultSet rs, int rowNum) throws SQLException {
                People person = new People(rs.getInt("people_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getDate("birth_date"),
                        rs.getString("adress")
                );
                return person;
            }
        }, id);

        return people;
    }*/
}
