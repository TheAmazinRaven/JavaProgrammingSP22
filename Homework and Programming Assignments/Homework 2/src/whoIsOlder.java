import java.util.Scanner;

public class whoIsOlder {
    public static void main(String[] args) {

        // known variables

        int currentMonth, currentDate, currentYear;
        currentMonth = 2;
        currentDate = 2;
        currentYear = 2022;

        // get unknown variables

        int birthMonth, birthDate, birthYear, birthDay, birthMonth2, birthDate2, birthYear2, birthDay2;

        Scanner input = new Scanner(System.in);

        // first friend

        System.out.println("What is your first friends birth month?");
        birthMonth = input.nextInt();
        System.out.println("What is your first friends birth date?");
        birthDate = input.nextInt();
        System.out.println("What is your first friends birth year?");
        birthYear = input.nextInt();

        // second friend

        System.out.println("What is your second friends birth month?");
        birthMonth2 = input.nextInt();
        System.out.println("What is your second friends birth date?");
        birthDate2 = input.nextInt();
        System.out.println("What is your second friends birth year?");
        birthYear2 = input.nextInt();

        // calculate current date from birthdays, idk how to get them all in one line. will concatenating work?

        // calculate with an if statement? if birthday is > than birthday2 then print "you friend1/2 is x years old, therefore they are older"


    }
}

/*
Write a java program to check which of your two friends is older. Ask for each of their dates of birth. month, day, year. All in integer data types. (Remember the lesser the older). Then print out the month, day and year of the older.
 */