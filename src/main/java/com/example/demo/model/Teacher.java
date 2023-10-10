package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.util.ArrayList;

public class Teacher {

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @NotBlank(message = "Имя не может быть пустым")
    private String name;

    @NotBlank(message = "Фамилия не может быть пустой")
    private String lastName;

    @Positive(message = "Почасовая ставка учителя должна быть положительным числом")
    private int teacherHourlySalary;
    private int workTime=0;
    public int getWorkTime() {
        return workTime;
    }


    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    private ArrayList<Student> students = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTeacherHourlySalary() {
        return teacherHourlySalary;
    }

    public void setTeacherHourlySalary(int teacherHourlySalary) {
        this.teacherHourlySalary = teacherHourlySalary;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }



}
