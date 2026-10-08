package com.studentresult;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentResultTest {

    StudentResult student = new StudentResult();

    @Test
    public void testCalculateTotal() {
        int result = student.calculateTotal(80, 90, 70);
        assertEquals(240, result);
    }

    @Test
    public void testCalculateAverage() {
        double result = student.calculateAverage(80, 90, 70);
        assertEquals(80.0, result);
    }

    @Test
    public void testPassResult() {
        String result = student.getResult(80, 90, 70);
        assertEquals("PASS", result);
    }

    @Test
    public void testFailResult() {
        String result = student.getResult(80, 30, 70);
        assertEquals("FAIL", result);
    }

    @Test
    public void testGrade() {
        String result = student.calculateGrade(80, 90, 70);
        assertEquals("A", result);
    }
}