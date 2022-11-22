package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  surname;
    private float height;
    private boolean lovecookie;
    private int favnumber;
    private double weight;
    private int views;

    public Employee(String surname, float height, boolean lovecookie, int favnumber, double weight) {
        this.surname = surname;
        this.height = height;
        this.lovecookie = lovecookie;
        this.favnumber = favnumber;
        this.weight = weight;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setLastName(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean getLovecookie() {
        return lovecookie;
    }

    public void setLovecookie(boolean lovecookie) {
        this.lovecookie = lovecookie;
    }

    public int getFavnumber() {
        return favnumber;
    }

    public void setFavnumber(int favnumber) {
        this.favnumber = favnumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
