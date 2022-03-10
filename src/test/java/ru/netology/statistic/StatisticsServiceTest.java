package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMax1() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {3, 12, 8, 4, 5, 3, 13, 6, 11, 1, 12};
        long expected = 13;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}
