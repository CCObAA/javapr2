package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  namepost;
    private float salary;
    private double maxsalary;
    private boolean paid;
    private int countemploey;
    private int views;

    public Post(double maxsalary, float salary, boolean paid, String namepost, int countemploey) {
        this.maxsalary = maxsalary;
        this.paid = paid;
        this.namepost = namepost;
        this.salary = salary;
        this.countemploey = countemploey;
    }

    public Post() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMaxsalary() {
        return maxsalary;
    }

    public void setMaxsalary(double maxsalary) {
        this.maxsalary = maxsalary;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getNamepost() {return namepost;}

    public void setNamepost(String namepost) {this.namepost = namepost;}

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getCountemploey() {
        return countemploey;
    }

    public void setCountemploey(int countemploey) {
        this.countemploey = countemploey;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }


}
