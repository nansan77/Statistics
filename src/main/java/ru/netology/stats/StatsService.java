package ru.netology.stats;

public class StatsService {
    public Long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }


    public long TheAverageNumber(long[] sales) {
        long sum = sum(sales);
        long result = sum / sales.length;
        return result;

    }

    public long MaximumSalesInMonth(long[] sales) {
        long month = 0;
        long max = sales[0];
        for (long sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }
        long MaximumSalesInMonth = 0;
        long CountMonth = 0;
        for (long sale : sales) {
            CountMonth += 1;
            if (sale == max) {
                MaximumSalesInMonth = CountMonth;
            }
        }
        return MaximumSalesInMonth;
    }

    public long MinimumSalesInMonth(long[] sales) {
        long month = 0;
        long min = sales[0];
        for (long sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        long MinimumSalesInMonth = 0;
        long CountMonth = 0;
        for (long sale : sales) {
            CountMonth += 1;
            if (sale == min) {
                MinimumSalesInMonth = CountMonth;
            }
        }
        return MinimumSalesInMonth;
    }
    public long BelowAverageSales(long[] sales){
        long avg = TheAverageNumber(sales);
        long CountMonth = 0;
        for (long sale :sales){
            if (sale > avg){
                CountMonth ++;
            }
        }
        return  CountMonth;
    }
    public long AboveAverageSales(long[] sales){
        long TheAverageNumber = TheAverageNumber(sales);
        long CountMonth = 0;
        for (long sale :sales) {
            if (sale < TheAverageNumber) {
                CountMonth = CountMonth + 1;
            }
        }
        return CountMonth;
    }
}

