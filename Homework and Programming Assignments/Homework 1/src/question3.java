import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {

        // open scanner

        Scanner input = new Scanner(System.in);

        // get input

        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // declare variables
        double Celsius = (5.0 / 9 * ( fahrenheit - 32));

        System.out.println(fahrenheit + " F is " + Celsius + " C.");

    }
}

/*
Write a Java program that converts a Fahrenheit to degree Celsius using the formula:

Let the user input the temperature to be converted and use the appropriate datatype to hold it. Then do your conversion using the below formula.

Celsius = 5.0/9 * (Fahrenheit – 32)

Print to the IDE console the Celsius equivalent of the user Fahrenheit temperature input.
 */
