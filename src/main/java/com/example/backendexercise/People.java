package com.example.backendexercise;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;



@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class People {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    private String first_name;
    private String last_name;
    private String birth;
    private String adress;


    }

