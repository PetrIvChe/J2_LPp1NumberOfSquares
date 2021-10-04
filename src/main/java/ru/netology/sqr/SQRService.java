package ru.netology.sqr;

public class SQRService {
    public static int CalculateOfSqr(int lowRangeLimit, int upperRangeLimit) {
        int count = 0;
        int i;
        for (i = 10; i < 100; i++) {
            if (i * i >= lowRangeLimit && i * i <= upperRangeLimit) {
                count++;
            }
        }
        return count;
    }
}