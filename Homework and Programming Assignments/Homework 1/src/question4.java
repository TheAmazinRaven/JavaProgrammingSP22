import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {

        // open Scanner

        Scanner input = new Scanner(System.in);

        // get input
        System.out.println("Please enter a radius.");

        // declare variables

        double radius = input.nextDouble();

        double area = 3.14 * radius * radius;

        // print area

        System.out.println("The area of your cirlce is " + area + ".");


    }
}

/*
Write a java program that calculates the area of a circle and print out the results to the IDE console. Ask the user to enter the radius of the circle to be calculated and then. Use the formula:

pi * R * R

Declare  as a constant with the value 3.14. (don’t use Math.pi)
 */