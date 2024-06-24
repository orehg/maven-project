package com.company;

import java.util.List;

public class StudentActions {
    public int averageAgeOfStudents(List<Student> listOfStudents) {
        return (int) listOfStudents.stream().mapToInt(Student::getAge).average().orElseThrow(RuntimeException::new);
    }
}
