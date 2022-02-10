import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("He said \"java is fun\"");
        char hh='G';
        System.out.println("Lower case? " + Character.isLowerCase(hh));

        String str1 = "Java";
        System.out.println("The last index of a " + str1.lastIndexOf("a"));

        String str2= " is Fun ";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(3));

        String p1="College";
        String p2= "College";
        if(p1 == p2)
            System.out.println("The are the same word");

        String p3 = new String("College");
        String p4 = new String("College");
        if(p3.equals(p4))
            System.out.println("SAME");



        //Simpler calc for few basic operation and one trig.
        Scanner sc=new Scanner(System.in);
        double num1;
        double num2;
        double ans=0;
        char operator;
        System.out.println("Please enter the first operand");
        num1 = sc.nextDouble();
        System.out.println("Please enter the second operand");
        num2 = sc.nextDouble();
        System.out.println("Please enter the operator use p=plus, m=minus"
                + "t=times... s=sine");
        operator = sc.next().charAt(0);

        if(operator == 'p')
            ans = num1 + num2;
        else if(operator == 'm')
            ans = num1 - num2;
        else if(operator == 's')
            ans = Math.sin(Math.toRadians(num1));


        System.out.printf("The result is %.2f %n", ans);


        double t = Math.random();
        System.out.println(t);
        System.out.println((int)(t*10));
    }
}
