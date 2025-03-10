package com.example.demo.model;

import jakarta.persistence.*;

@Entity // annotation qui dit que cette classe correspond à une table de notre BDD sql
@Table(name="students") //indique le nom de cette table associée
public class Student {

    @Id // indique que cet attribut est la primary key de la table
    @GeneratedValue(strategy=GenerationType.IDENTITY) // id doit être auto incrémenté
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="school_year")
    private String year;

    @Column(name="student_group")
    private String group;

    public String toString(){
        return firstName + " " + lastName + " " + year + " " + group;
    }

    public Integer getId(){
        return this.id;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getYear(){
        return this.year;
    }

    public String getGroup(){
        return this.group;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setYear(String year){
        this.year = year;
    }

    public void setGroup(String group){
        this.group = group;
    }

}
