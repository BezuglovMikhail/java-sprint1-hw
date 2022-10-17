
public class StepTracker {

    int[][] stepDayMonth;
    int goalStep = 10000;
    Converter converter = new Converter();

    StepTracker() {
        stepDayMonth = new int[12][30];
    }

    int saveStepDay(int month, int day, int stepDay) {
        stepDayMonth[month][day - 1] = stepDayMonth[month][day - 1] + stepDay;
        return stepDayMonth[month][day - 1];
    }

    void printStepStatistics(int month) {
        printAllStepMonth(month);
        allStepMonth(month);
        System.out.println("\n" + "Общее количество шагов за " + month + " - месяц: " + allStepMonth(month));
        System.out.println("Максимальное пройденное количество шагов в месяце " + findMaxStepMonth(month));
        System.out.println("Среднее количество шагов = " + allStepMonth(month) / 30);
        converter.convert(allStepMonth(month));
        System.out.println("Лучшая серия в этом месяце: " + likeSeries(month));
    }

    int allStepMonth(int month) {
        int sumStep = 0;
        for (int i = 0; i < 30; i++) {
            sumStep = sumStep + stepDayMonth[month][i];
        }
        return sumStep;
    }

    void printAllStepMonth(int month) {
        for (int i = 0; i < 30; i++) {
            System.out.print((i + 1) + " день: " + stepDayMonth[month][i] + ", ");
        }
    }

    int findMaxStepMonth(int month) {
        int maxStepMonth = 0;
        for (int i = 0; i < 30; i++) {
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
        int max = 0;
        int j = 0;
        for (int i = 0; i < 30; i++) {

            if (stepDayMonth[month][i] >= goalStep) {
                j = j + 1;
                if (j == 30) {
                    max = j;
                }

            } else if (max <= j) {
                max = j;
                j = 0;
               }
        } return max;
    }
}
