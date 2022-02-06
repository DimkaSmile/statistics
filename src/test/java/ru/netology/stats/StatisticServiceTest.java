package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void shouldSum() {
        StatisticService service = new StatisticService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

         long actual = service.sum(purchases);

        long expected = 180;
        assertEquals (expected, actual);

    }

    @Test
    void shouldAvg() {
        StatisticService service = new StatisticService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = service.avg(purchases);

        long expected = 15;
        assertEquals (expected, actual);

    }

    @Test
    void shouldReturnWithMax() {
        StatisticService service = new StatisticService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthWithMax(purchases);

        long expected = 8;
        assertEquals (expected, actual);

    }

    @Test
    void shouldReturnWithMin() {
        StatisticService service = new StatisticService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthWithMin(purchases);

        long expected = 9;
        assertEquals (expected, actual);

    }

    @Test
    void shouldReturnCountWithMoreThanAvg() {
        StatisticService service = new StatisticService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthWithMoreThanAvg(purchases);

        long expected = 5;
        assertEquals (expected, actual);

    }


    @Test
    void shouldReturnCountWithLessThanAvg() {
        StatisticService service = new StatisticService();
        long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthWithLessThanAvg(purchases);

        long expected = 5;
        assertEquals (expected, actual);

    }
}