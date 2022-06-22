package com.springrest.springrest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    //generate id

    @Id //primary key

    @Column(name = "id")

    private Long id;
    //generate name
    @Column(name="name")
    private String name;
}
