import java.util.Scanner;

public class interestRate {
    public static void main(String[] args) {
        double monthInterest, loanAmt, totalPayment, monthPayment;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your monthly interest.");
        monthInterest = input.nextDouble();

        monthInterest = (monthInterest / 100);
        System.out.println("How many years will you be paying?");
        double numYear = input.nextInt();

        System.out.println("How much will you be borrowing for the loan?");
        loanAmt = input.nextDouble();

        double den = Math.pow(1 + monthInterest, numYear * 12);
        System.out.println(den);
        monthPayment = (monthInterest * loanAmt) / (1 - (1 / den));
        // ^ formula from assignment incorporated to the best of my knowledge

        System.out.printf("Amount due monthly is : %.2f\n", monthPayment);


        System.out.printf("The total you will pay is: %.2f\n", (monthPayment * 12 * numYear));

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