
public class StepTracker {

    static final int MONTH_COUNT = 12;
    static final int MONTH_DAY_COUNT = 30;

    int[][] stepDayMonth;
    int goalStep = 10000; //значение количества шагов в день по умолчанию.
    Converter converter = new Converter();

    StepTracker() {
        stepDayMonth = new int[MONTH_COUNT][MONTH_DAY_COUNT];
    }

    int saveStepDay(int month, int day, int stepDay) {
        stepDayMonth[month][day - 1] = stepDayMonth[month][day - 1] + stepDay;
        return stepDayMonth[month][day - 1];
    }

    void printStepStatistics(int month) {
        printAllStepMonth(month);
        System.out.println("\n" + "Общее количество шагов за " + month + " - месяц: " + allStepMonth(month));
        System.out.println("Максимальное пройденное количество шагов в месяце " + findMaxStepMonth(month));
        System.out.println("Среднее количество шагов = " + allStepMonth(month) / MONTH_DAY_COUNT);
        System.out.println("Пройденная дистанция в (км): " + converter.convertStep(allStepMonth(month)) + ".");
        System.out.println("Количество сожжёных килоколорий: " + converter.convertCalories(allStepMonth(month)) + ".");
        System.out.println("Лучшая серия в этом месяце: " + likeSeries(month));
    }

    int allStepMonth(int month) {
        int sumStep = 0;
        for (int i = 0; i < MONTH_DAY_COUNT; i++) {
            sumStep = sumStep + stepDayMonth[month][i];
        }
        return sumStep;
    }

    void printAllStepMonth(int month) {
        for (int i = 0; i < MONTH_DAY_COUNT; i++) {
            System.out.print((i + 1) + " день: " + stepDayMonth[month][i] + ", ");
        }
    }

    int findMaxStepMonth(int month) {
        int maxStepMonth = 0;
        for (int i = 0; i < MONTH_DAY_COUNT; i++) {
            if (stepDayMonth[month][i] > maxStepMonth) {
                maxStepMonth = stepDayMonth[month][i];
            }
        }
        return maxStepMonth;
    }

    int changeGoalStep(int newGoalStep) {
        goalStep = newGoalStep;
        return goalStep;
    }

    int likeSeries(int month) {
        int maxSeries = 0;
        int max;
        int j = 0;
        for (int i = 0; i < MONTH_DAY_COUNT; i++) {
            if (stepDayMonth[month][i] >= goalStep) {
                j = j + 1;
                max = j;
                if (maxSeries <= max) {
                    maxSeries = max;
                }
            } else {
                j = 0;
            }
        }
        return maxSeries;
    }
}
