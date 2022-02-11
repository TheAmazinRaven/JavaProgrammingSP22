import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        double num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers, with a space in between.");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        double numDegree = 0;
        double numRadians = 0;

        System.out.println("Please enter the operator (+, -, *, /, ^, %, t = sqrt, p = tan, q = sin, or r = cos)");

        char operator = input.next().charAt(0);

        input.close();

        switch (operator) {
            case '+': // case for addition
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;
            case '-': // case for subtraction
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;
            case '*': // case for multiplication
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;
            case '/': // case for division
                if (num2 != 0)
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                else
                    System.out.println("Cannot divide by 0.");
                break;
            case 'q': // case for SIN
                System.out.println("Please enter the number as a degree.");

                numDegree = input.nextDouble(); //stores input as double
                numRadians = Math.toRadians(numDegree); // convert input to radians
                System.out.printf("%.2f", Math.sin(numRadians));
                break;
            case 'p': // case for TAN
                System.out.println("Please enter the number as a degree.");

                numDegree = input.nextDouble(); //stores input as double
                numRadians = Math.toRadians(numDegree); // convert input to radians
                System.out.printf("%.2f", Math.tan(numRadians));
                break;
            case 'r': // case for COS
                System.out.println("Please enter the number as a degree.");

                numDegree = input.nextDouble(); //stores input as double
                numRadians = Math.toRadians(numDegree); // convert input to radians
                System.out.printf("%.2f", Math.cos(numRadians));
                break;
            case 't': // case for SquareRoot
                System.out.println("Please enter the base of the square root.");
                num1 = input.nextDouble();
                System.out.printf("%.2f", Math.sqrt(num1));
                break;

        }
    }
}