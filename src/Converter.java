public class Converter {

    double lengthStep;
    double caloriesStep;

    Converter() {

        lengthStep = 0.00075; // один шаг равен 75 см.
        caloriesStep = 0.050; // один шаг сжигает 50 калорий.

        }

        double convertStep(int allStepMonth) {
             return allStepMonth * lengthStep;
        }
        double convertCalories(int allStepMonth) {
            return allStepMonth * caloriesStep;
    }
}
