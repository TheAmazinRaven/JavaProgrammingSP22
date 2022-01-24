import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        // declare variables

        String name, major;
        char gender;
        int age;

        // open the scanner
        Scanner input = new Scanner(System.in);

        // declare scanner inputs as variables
        System.out.println("What is your name?");
        name = input.nextLine();

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("What is your gender? (W) - Woman, (M) - Man, (N) - Non-binary.");
        gender = input.next().charAt(0);
        System.out.println("");


        // why doesn't this work?

        System.out.println("What is your major?");
        major = input.next();


        // print user input
        System.out.println("Hi " + name + "! You are " + age + " years old. Your gender is " + gender + ". & Your major is " + major + "!");
    }
}

/*
Write a Java program that lets a user enter their name, gender, major and age and then print to the IDE console the user entries each on a line.
 */
