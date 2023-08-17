package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }
        return totalSales;
    }

    public long averageSales(long[] sales) {
        return totalSales(sales) / sales.length;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int i;
        for (i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int i;
        for (i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int quantityBellowAverage(long[] sales) {
        int quantity = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                quantity++;
            }
        }
        return quantity;
    }

    public int quantityUpperAverage(long[] sales) {
        int quantity = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                quantity++;
            }
        }
        return quantity;
    }
}


