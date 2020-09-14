package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
        long[]incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatisticService service = new StatisticService();
        long expected = 20;
        long actual = service.findMax(incomes);
        assertEquals(expected,actual);
    }
}