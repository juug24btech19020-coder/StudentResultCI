package com.studentresult;

public class StudentResult {

    // Method 1: Calculate total marks
    public int calculateTotal(int java, int cloudDevOps, int dbms) {
        return java + cloudDevOps + dbms;
    }

    // Method 2: Calculate average marks
    public double calculateAverage(int java, int cloudDevOps, int dbms) {
        return calculateTotal(java, cloudDevOps, dbms) / 3.0;
    }

    // Method 3: Determine pass or fail
    public String getResult(int java, int cloudDevOps, int dbms) {
        if (java >= 40 && cloudDevOps >= 40 && dbms >= 40) {
            return "PASS";
        }

        return "FAIL";
    }

    // Method 4: Calculate grade
    public String calculateGrade(int java, int cloudDevOps, int dbms) {

        double average = calculateAverage(java, cloudDevOps, dbms);

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else if (average >= 40) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        StudentResult student = new StudentResult();

        int java = 85;
        int cloudDevOps = 90;
        int dbms = 80;

        int total = student.calculateTotal(java, cloudDevOps, dbms);
        double average = student.calculateAverage(java, cloudDevOps, dbms);
        String result = student.getResult(java, cloudDevOps, dbms);
        String grade = student.calculateGrade(java, cloudDevOps, dbms);

        System.out.println("Student Result");
        System.out.println("----------------------");
        System.out.println("Java Marks       : " + java);
        System.out.println("Cloud DevOps     : " + cloudDevOps);
        System.out.println("DBMS Marks       : " + dbms);
        System.out.println("Total Marks      : " + total);
        System.out.println("Average Marks    : " + average);
        System.out.println("Result           : " + result);
        System.out.println("Grade            : " + grade);
    }
}