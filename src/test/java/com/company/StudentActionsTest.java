package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class StudentActionsTest {
    private final StudentActions studentActions = new StudentActions();
    @Test
    public void testAverageAgeOfStudents() {
        Student firstStudent = new Student(12, "Vasya");
        Student secondStudent = new Student(13, "Andrey");
        Student thirdStudent = new Student(11, "Oleg");

        List<Student> studentList = List.of(firstStudent, secondStudent, thirdStudent);

        int expectedNumber = 12;
        int actualNumber = studentActions.averageAgeOfStudents(studentList);
        Assert.assertEquals(actualNumber, expectedNumber, "Number is incorrect");
    }
}