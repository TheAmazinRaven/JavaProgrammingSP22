import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class practiceChap3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random ran = new Random();

        boolean b = false;

        System.out.println("b is now " + b);

        b = (1 < 2);

        System.out.println("b is now " + b);

        int a = ran.nextInt(10);
        int aa = ran.nextInt(10);
        int actualAnswer = a + aa;

        System.out.println("What is the addtion of " + a + "and" + aa);
        double response = input.nextInt();

        if (response == actualAnswer)
            System.out.println("You're correct.");
        else
            System.out.println("You're wrong, please try again.");
    }
}
