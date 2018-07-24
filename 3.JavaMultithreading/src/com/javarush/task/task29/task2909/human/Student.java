package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends UniversityPerson {

    private double averageGrade;

    private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name,age);
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }



    public void incAverageGrade(double delta){
        setAverageGrade(getAverageGrade() + delta);
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setBeginningOfSession(Date beginningOfSession) {
        this.beginningOfSession = beginningOfSession;
    }

    public void setEndOfSession(Date endOfSession) {
        this.endOfSession = endOfSession;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int value)
    {
            course =  value;
    }

    public void setAverageGrade(double value)
    {
        averageGrade = value;
    }



    public void live() {
        learn();
    }

    public void learn() {
    }

    @Override
    public String getPosition()
    {

        return "Студент";
    }

}