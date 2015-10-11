package com.github.jullil.balloooon.entity;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name="my_user")
public class User {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @NaturalId
    @Column(name="login")
    private String login;

    @Column(name="password")
    //@ColumnTransformer(write="encrypt(?)")
    private String password;

    public User() {}

    public User(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}