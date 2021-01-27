package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sum(sales);
        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void TheAverageNumber() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.TheAverageNumber(sales);
        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void MaximumSalesInMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.MaximumSalesInMonth(sales);
        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void MinimumSalesInMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7,14, 14, 18};
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.MinimumSalesInMonth(sales);
        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void BelowAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.BelowAverageSales(sales);
        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void AboveAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected =5;
        long actual = service.AboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}