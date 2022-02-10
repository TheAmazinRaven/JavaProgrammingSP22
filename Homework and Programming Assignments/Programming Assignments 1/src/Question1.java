import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        double num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers, with a space in between.");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        System.out.println("Please enter the operator (+, -, *, /, ^, %, sqrt, tan, sin, or cos)");

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


            default:
                System.out.printf("%c is an invalid operator ", operator);
        }
    }
}

/* Write a java program that functions as a Calculator with the following operators:
+, -, *, /, %, ^, sin, cos, tan, sqrt (plus, minus, multiplication, division, modulo,
exponent, sine, cosine, tangent, square root). Output the result in the console.

The program shall require two or one numerical inputs and one operator from the user.
You shall be using the switch case for operator selections and computation

 */
