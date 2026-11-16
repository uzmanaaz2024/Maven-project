package com.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private final StudentService service = new StudentService();

    @Test
    void createsStudentWithValidInput() {
        assertEquals("Ayesha (85/100)", service.createStudent("Ayesha", 85));
    }

    @Test
    void assignsGradeA() {
        assertEquals("A", service.grade(85));
    }

    @Test
    void rejectsBlankName() {
        assertThrows(IllegalArgumentException.class,
                () -> service.createStudent(" ", 70));
    }

    @Test
    void rejectsMarksAbove100() {
        assertThrows(IllegalArgumentException.class, () -> service.grade(120));
    }
}
