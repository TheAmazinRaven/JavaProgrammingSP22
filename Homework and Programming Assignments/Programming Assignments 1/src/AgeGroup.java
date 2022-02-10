import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the age group classifier.");

        int age;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        age = input.nextInt();

        if (age >= 0 && age <= 1) {
            System.out.println("Your age group is: Infant");
        }else if( age >= 2 && age <= 4){
            System.out.println("Your age group is: Toddler");
        }else if( age >= 5 && age <= 12){
            System.out.println("Your age group is: Child");
        }else if( age >= 13 && age <= 19){
            System.out.println("Your age group is: Teenager");
        }else if(age >= 20 && age <= 39){
            System.out.println("Your age group is: Young Adult");
        }else if(age >= 40 && age <= 64){
            System.out.println("Your age group is: Middle age adult");
        }else if( age >= 65 && age <= 100){
            System.out.println("Your age group is: Senior");
        }else{
            System.out.println("Invalid age, please enter valid age!");
        }
    }
}

/*
Write a Java program to categorize a person based on their age
(allow only positive inputs) into age group: Infant = 0-1yr,
Toddler = 2-4 yrs, Child = 5-12 yrs, Teenager = 13-19 yrs, Young Adult = 20-39 yrs,
Middle Age Adult = 40-64 yrs, Senior Adult = 65+

Use the if-else statements.
Print the age group the user of your program belong in the console.
 */