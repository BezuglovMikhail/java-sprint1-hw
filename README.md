# java-sprint1-hw
## ��� ����������� ������� "������� �������".
���������� ����� ���������� ��������� � **�����**:
1. ������� ������ � ���������� ���������� ����� �� ��������� �������.
2. ������� � ������������� ���� �� ���������� ����� � ����.
3. ���������� ���������� ���������� ����� �� ����.
4. ���������� ���������� �� ������������ �����.

���������� �������� �� Java. ������ ����:
```java
public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        System.out.println("������ ����� ��������!");
        System.out.println("���� ��������� �� " + stepTracker.changeGoalStep(stepTracker.goalStep) + " ����� � ����.");
        printMenu();
        
        int command = scanner.nextInt();
    }
}
```
------
� ���, ��� ��������� ��������� ����� ����������, ����� ������ � [������-����������](https://practicum.yandex.ru/java-developer/ "��� ���� Java!")
