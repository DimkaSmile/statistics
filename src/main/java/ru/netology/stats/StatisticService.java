package ru.netology.stats;

public class StatisticService {
    public long sum(long[] items) {
        long result = 0;
        for (long item : items) {
            result += item;
        }
        return result;
    }

    public double avg(long[] items) {
        return ((double) sum(items)) / items.length;
    }


    public int monthWithMax(long[] items) {

        long max = items[0];
        for (long item : items) {
            if (item > max) {
                max = item;
            }
        }
        int monthCount = 0;
        int monthNumber = 0;
        for (long item : items) {
            monthCount++;
            if (item == max) {
                monthNumber = monthCount;
            }
        }
        return monthNumber;
    }

    public int monthWithMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (item < min) {
                min = item;
            }
        }
        int monthCount = 0;
        int monthNumber = 0;
        for (long item : items) {
            monthCount++;
            if (item == min) {
                monthNumber = monthCount;
            }
        }
        return monthNumber;
    }

    public int monthWithMoreThanAvg(long[] items) {
        double avg = avg(items);
        int count = 0;
        for (long item : items) {
            if (item > avg) {
                count++;

            }
        }
        return count;
    }


    public int monthWithLessThanAvg(long[] items) {
        double avg = avg(items);
        int count = 0;
        for (long item : items) {
            if (item < avg) {
                count++;
            }
        }
        return count;
    }

}
