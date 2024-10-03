/*
Enzo Gaddi
30/09/2024
Practise using GitHub with past code
*/

package ie.atu.week3;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);


        System.out.println("Enter a Second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        System.out.println("Enter an operation(add, subtract, multiply, divide): ");
        String operation = scan1.next();

        boolean validOperation = true;
        double result = switch (operation)
        {
            case "add" ->
            {
                double sum = firstNum + secondNum;
                System.out.println("The sum is: " + sum);
                yield sum;
            }

            case "subtract" ->
            {
                double sub = firstNum - secondNum;
                System.out.println("The sum is: " + sub);
                yield sub;
            }

            case "multiply" ->
            {
                double mul = firstNum * secondNum;
                System.out.println("The product is: " + mul);
                yield mul;
            }

            case "divide" ->
            {
                double div = firstNum / secondNum;
                System.out.println("The product is: " + div);
                yield div;
            }

            default ->
            {
                System.out.println("Invalid operation");
                yield 0;
            }
        };

    }
}
