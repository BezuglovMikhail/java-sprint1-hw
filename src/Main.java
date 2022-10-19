
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        System.out.println("Пришло время практики!");
        System.out.println("Цель проходить по " + stepTracker.changeGoalStep(stepTracker.goalStep) + " шагов в день.");
        printMenu();
        int command = scanner.nextInt();

        while (command != 0) {

            if (command == 1) {
                System.out.println("В каком месяце вы хотите ввести шаги: 0 - Янв, 1 - Фев, 2 - Мар, 3 - Апр, 4 - Май, 5 - Июн, 6 - Июл, 7 - Авг, 8 - Сен, 9 - Окт, 10 - Ноя, 11 - Дек?");
                int month = scanner.nextInt();
                    while ((month > 11) || (month < 0)) {
                        System.out.println("Такого месяца нет. Введите месяц заново.");
                        month = scanner.nextInt();
                    }
                    System.out.println("За какой день вы хотите ввести шаги: ");
                int day = scanner.nextInt();
                    while (day > 30 || day < 1) {
                        System.out.println("В месяце 30 дней. Введите день заново.");
                        day = scanner.nextInt();
                    }
                System.out.println("Введите количество шагов: ");
                int stepDay = scanner.nextInt();
                while (stepDay < 0) {
                    System.out.println("Количество шагов должно быть положительным.");
                    stepDay = scanner.nextInt();
                }
                System.out.println("Количество шагов сохранено! Вы прошли в этот день: " + stepTracker.saveStepDay(month, day, stepDay));

            } else if (command == 2) {
                System.out.println("За какой месяц вы хотите узнать статистику: 0-Янв, 1-Фев, 2-Мар, 3-Апр, 4-Май, 5-Июн, 6-Июл, 7- Авг, 8-Сен, 9-Окт, 10-Ноя, 11- Дек?");
                int month = scanner.nextInt();
                    while ((month > 11) || (month < 0)) {
                        System.out.println("Такого месяца нет. Введите месяц заново.");
                        month = scanner.nextInt();
                    }
                stepTracker.printStepStatistics(month);

            } else if (command == 3) {
                System.out.println("Введите новую цель по количеству шагов в день.");
                int newGoalStep = scanner.nextInt();
                    while (newGoalStep < 0) {
                        System.out.println("Цель не может быть отрицательной. Введите новую цель по количеству шагов в день.");
                        newGoalStep = scanner.nextInt();
                         }
                    stepTracker.changeGoalStep(newGoalStep);
                    System.out.println("Установлена новая цель по количеству шагов в день: " + stepTracker.changeGoalStep(newGoalStep));

            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
            printMenu();
            command = scanner.nextInt();
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определенный месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}

// Артем, не могу сообразить как реализовать метод проверки ввода (при вводе переменной другого типа).