package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculateOfSqr() {
        SQRService service = new SQRService();
        int expected = 3;
        long actual = service.CalculateOfSqr(200, 300);
        assertEquals(expected, actual);

    }
}