import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!This is zobeir");

        String myName = "Zobeir";
        int age = 32;
        double gpa = 4.0;
        char initialLetter = myName.charAt(0);
        char lastLetter = myName.charAt(5);
        boolean atBritishGas = true;

        System.out.println(myName + " " + "is " + age +", and his name starts with "
        +initialLetter +" and End with " + lastLetter + ". The good news is,He will be working in the "
       + "Centrica "+ atBritishGas+ " as a software developer soon." );

       System.out.println("Enter Your new Name haha ...");
       Scanner input = new Scanner(System.in);
         myName  =input.next();
         System.out.println("Your new name is " + myName);

    }
}
