public class Converter {

    double lengthStep;
    double caloriesStep;

    Converter() {

        lengthStep = 0.00075; // ���� ��� ����� 75 ��.
        caloriesStep = 0.050; // ���� ��� ������� 50 �������.

        }

        double convertStep(int allStepMonth) {
             return allStepMonth * lengthStep;
        }
        double convertCalories(int allStepMonth) {
            return allStepMonth * caloriesStep;
    }
}
