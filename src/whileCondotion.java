import java.util.Scanner;

public class whileCondotion {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        Boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("song is on repeat");
            System.out.println("Do you want to change the music?");
            String input = Scanner.next();
            if("yes".equals(input)){
                isOnRepeat = false;
            }
        }
        System.err.println("playing next song! ");
    }
}
