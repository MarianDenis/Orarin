package com.orarin.orarin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Marks {


    @Id
    @GeneratedValue
    private Integer id;

    private Double sub1;
    private Double sub2;
    private Double sub3;
    private Double sub4;

    @OneToOne
    @JoinColumn(name = "id")
    private Student student;
}
