package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private int age;

    private List<Student> students = new ArrayList();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double avarageGrade) {

        Student stud = null;

        for(Student s : students)
        {
            if(s.getAverageGrade() == avarageGrade)
            {
                stud = s;
            }
        }

        return stud;

    }

    public Student getStudentWithMaxAverageGrade() {

        double max = 0.0;
        Student stud = null;

        for(Student s : students)
        {
            if(s.getAverageGrade() > max)
            {
                max = s.getAverageGrade();
                stud = s;
            }
        }

        return stud;
    }

    public Student getStudentWithMinAverageGrade()
    {
        double min = Double.MAX_VALUE;
        Student stud = null;

        for(Student s : students)
        {
            if(s.getAverageGrade() < min)
            {
                min = s.getAverageGrade();
                stud = s;
            }
        }

        return stud;
    }

    public void expel(Student student)
    {
        students.remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}