import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        double monthInterest, loanAmt, totalPayment, monthPayment;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your monthly interest.");
        monthInterest = input.nextInt();

        System.out.println("How many years will you be paying?");
        double numYear = input.nextInt();

        System.out.println("How much will you be borrowing for the loan?");
        loanAmt = input.nextDouble();

        monthPayment = (monthInterest * loanAmt) / (1 - 1 / Math.pow(1 + monthInterest, numYear * 12));
        // ^ formula from assignment incorporated to the best of my knowledge

        System.out.printf("Amount due monthly is : %.2f\n", monthPayment);

        totalPayment = (monthPayment * 12);

        System.out.printf("The total you will pay every year is: %.2f\n", (totalPayment * 12 * numYear));



        System.out.println("Amount due monthly is: " + monthPayment);
        System.out.println("The total you will pay every year is: " + (totalPayment * numYear));

    }
}

/*
Write a Java program that lets the user enter the monthly interest rate,
number of years, and loan amount, and computes monthly payment and total
payment and print both results each on a separate line.

monthPayment = (loanAmt * monthInterest) / (1 - (1 / (1 + mothInterest) ^ numYear))
The total payment = $monthlyPayment * 12 * numberOfYears$

The total payment = monthlyPayment * 12 * numberOfYears
 */