public class Converter {

    double lengthStep;
    double caloriesStep;

    Converter() {
        lengthStep = 0.00075;
        caloriesStep = 0.050;
        }

        void convert(int allStepMonth) {
        double way = allStepMonth * lengthStep;
            System.out.println("Пройденная дистанция в (км): " + way + ".");
        double burnCalories = allStepMonth * caloriesStep;
                System.out.println("Количество сожжёных килоколорий: " + burnCalories + "." );
        }
}
