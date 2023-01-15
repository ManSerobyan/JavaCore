package homeworks.homework7;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double result = calc.plus(12, 24);
        System.out.println(result);

        result = calc.minus(97, 197);
        System.out.println(result);


        result = calc.multiply(76, 379);
        System.out.println(result);

        result = calc.divide(1148, 24);
        System.out.println(result);


    }

}
