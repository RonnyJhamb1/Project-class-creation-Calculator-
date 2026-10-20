import java.util.Scanner;





public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator!");
        System.out.println("Enter: operator value1 value2 (example: + 5 3)");

        String operator = input.next();
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double result;

        if (operator.equals("+"))
            result = calculator.addition(value1, value2);
        else if (operator.equals("-"))
            result = calculator.subtraction(value1, value2);
        else if (operator.equals("*"))
            result = calculator.multiplication(value1, value2);
        else if (operator.equals("/"))
            result = calculator.division(value1, value2);
        else {
            System.err.println("Invalid operator.");
            return;
        }
        System.out.println(value1 + " " + operator + " " + value2 + " = " + result);
    }
}