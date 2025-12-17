package com.example.demo.entity;


public class Student{
    private long id;
    private String name;
    private String email;
    private float cgpa;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void SetEmail(String email){
        this.email = email;
    }

    public float getCgpa()
    {
        return cgpa;
    }

    public void setCgpa(float cgpa)
    {
        this.cgpa = cgpa;
    }

    public Student(long id, String name, String email, float cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public Student(){
        
    }
}