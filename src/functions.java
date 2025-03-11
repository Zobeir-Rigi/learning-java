import java.util.Scanner;

public class functions {

    public static void announceTeaTime() {
        System.out.println("waiting for tea time ...");
        System.out.println("Type a random word and press Enter to start tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its tea time!");
    }

public static void main(String[] orgs){
    announceTeaTime();
}
    
}
