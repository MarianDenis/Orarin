package com.orarin.orarin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private String contact;
    private String dept;
    private String year;
    private String pass;

}
