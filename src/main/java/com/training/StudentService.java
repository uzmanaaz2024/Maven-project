package com.training;

public class StudentService {
    public String createStudent(String name, int marks) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Student name is required");
        }
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        return name.trim() + " (" + marks + "/100)";
    }

    public String grade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        if (marks >= 80) return "A";
        if (marks >= 60) return "B";
        if (marks >= 40) return "C";
        return "Needs improvement";
    }
}
