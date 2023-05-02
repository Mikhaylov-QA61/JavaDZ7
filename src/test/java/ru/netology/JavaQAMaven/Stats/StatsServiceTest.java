package ru.netology.JavaQAMaven.Stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.JavaQAMaven.Stats.StatsService;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumAllSalesTest() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmountTest() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthMaxSalesTest() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.numberMonthMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthMinSalesTest() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.numberMonthMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberSalesBelowAverageTest() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberSalesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberSalesAboveAverageTest() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberSalesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
