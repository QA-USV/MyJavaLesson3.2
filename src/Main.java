public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; //Укажите свой рост в метрах;
        double weight = 78.8; //Укажите свой вес в кг;
        double bmi = service.calculate(height, weight);
        String yourBmi = String.format("Ваш Индекс массы тела (BMI) равен: %.2f. ", bmi);
        System.out.println(yourBmi);
    }
}
