import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        String file = "studentInfo.txt";

        Scanner input = new Scanner();



        System.out.println("Please enter your name:");
        String name = input.nextLine();

        System.out.println("Please enter your age:");
        int age = input.nextInt();

        System.out.println("Please enter your major:");
        String major = input.nextLine();

        System.out.println("Please enter your gender:");
        String gender = input.nextLine();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
    }
}

/*
Write a Java program to file student information in a student
directory of your project folder. Create a student directory in your project directory to store all student file. Each file should have the student name, age, major and gender. Each of these student entries should be on a separate line.
 */