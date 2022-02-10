import javax.naming.Name;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;

public class studentInfo {

    public static void main(String[] args) throws IOException {

        File file = new File("Student");
        file.mkdir();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = input.nextLine();

        File studentInfo = new File("Student\\" + name + ".txt");

        studentInfo.createNewFile();
        PrintWriter Student = new PrintWriter(studentInfo);


        Student.println(name);
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        Student.println(age);

        System.out.println();
        System.out.println("Please enter your major:");
        String major = input.next();
        Student.println(major);

        System.out.println("Please enter your gender:");
        String gender = input.next();
        Student.println(gender);

        Student.flush();

    }
}


/*
Write a Java program to file student information in a student
directory of your project folder. Create a student directory in your project directory to store all student file. Each file should have the student name, age, major and gender. Each of these student entries should be on a separate line.
 */