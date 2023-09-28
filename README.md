# java-sprint1-hw
## Это репозиторий проекта "Счетчик калорий".
Приложение имеет консольный интерфейс и **умеет**:
1. Хранить данные о количестве пройденных шагов за несколько месяцев.
2. Ставить и просматривать цель по количеству шагов в день.
3. Показывать пройденное количество шагов за день.
4. Показывать статистику за определенный месяц.

Приложение написано на Java. Пример кода:
```java
public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        System.out.println("Пришло время практики!");
        System.out.println("Цель проходить по " + stepTracker.changeGoalStep(stepTracker.goalStep) + " шагов в день.");
        printMenu();
        
        int command = scanner.nextInt();
    }
}
```
------
О том, как научиться создавать такие приложения, можно узнать в [Яндекс-Практикуме](https://practicum.yandex.ru/java-developer/ "Тут учат Java!")
