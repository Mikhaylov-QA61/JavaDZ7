package ru.netology.JavaQAMaven.Stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int summ = 0;
        for (int i : sales) {
            summ += i;
        }
        return summ;
    }

    public int averageSalesAmount(int[] sales) {
        int averageSales = sumAllSales(sales) / (sales.length);
        return averageSales;
    }

    public int numberMonthMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numberMonthMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberSalesBelowAverage(int[] sales) {
        int numberSales = 0;
        for (int i : sales) {
            if (i < averageSalesAmount(sales)) {
                numberSales++;
            }
        }
        return numberSales;
    }

    public int numberSalesAboveAverage(int[] sales) {
        int numberSales = 0;
        for (int i : sales) {
            if (i > averageSalesAmount(sales)) {
                numberSales++;
            }
        }
        return numberSales;
    }
}
