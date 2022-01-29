package com.example.catwalk.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public",name="user_info")
@Setter
@Getter
public class User {
    @Id
    private Long id;
    private String mail;
    private String password;
    private String name;

}
