public class Converter {

    double lengthStep;
    double caloriesStep;

    Converter() {
        lengthStep = 0.00075;
        caloriesStep = 0.050;
        }

        double convertStep(int allStepMonth) {
             return allStepMonth * lengthStep;
        }
        double convertCalories(int allStepMonth) {
            return allStepMonth * caloriesStep;
    }
}
