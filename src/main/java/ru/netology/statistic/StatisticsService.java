package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }

    public long findMin(long[] incomes) {
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }

    public long findAvg(long[] incomes) {
        long current_avg = incomes[0];
        for (long income : incomes)
            if (current_avg >= income)
                current_avg = income;
        return current_avg;
    }

    public long findAvgg(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max == income)
                current_max = 3;
        return current_max;
    }

    public long findMaxx(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max <= income)
                current_max = incomes[0];
        return current_max;
    }
}