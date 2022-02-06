package ru.netology.stats;

public class StatisticService {
    //это  метод, который возвращает сумму своих аргументов.
// Метод добавляет два целых числа вместе согласно оператору +
    public long sum(long[] items) {
        long result = 0;
        for (long item : items) {
//            result = result + item; - следующая строчка более проще, чем эта, но на выходе одно и то же
            result += item;
        }
        return result;
    }

    //Функция AVG () вычисляет среднее арифметическое набора значений, выполняя деление суммы этих значений
// на число значений, не равных NULL
    public double avg(long[] items) {
//    long sum = sum(items);
//    long avg = sum / items.length; - сумму делим на длинну массива и выводим avg - 20 строка
//      return avg;
//    return sum / items.length;  // более упрощённая запись строк 19+20

// Так же можно просто объеденить строку 18 и 21:
        return ((double) sum(items)) / items.length;
    }


    public int monthWithMax(long[] items) {

        long max = items[0];
        for (long item : items) {
            if (item > max) {
                max = item;
            }
        }
        int monthCount = 0;  //используем счетчик
        int monthNumber = 0; // используем номер месяца (хранит информацию о номере месяца)
        for (long item : items) {
//            monthCount = monthNumber + 1; - увеличиваем счётчик на кдиницу
//            monthCount +=1;
            monthCount++; // Бодее короткая запись чем в строках 39 и 40
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
        int monthCount = 0;  //используем счетчик
        int monthNumber = 0; // используем номер месяца (хранит информацию о номере месяца)
        for (long item : items) {
//            monthCount = monthNumber + 1; - увеличиваем счётчик на единицу
//            monthCount +=1;
            monthCount++; // Бодее короткая запись чем в строках 39 и 40
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
