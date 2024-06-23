package A01;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {
    public static void main(String[] args) {
        //User Input
        Scanner s = new Scanner(System.in);
        System.out.println("0 - Stone, 1 - Paper, 2 - Scissor");
        int userInput = s.nextInt();

        //Computer Input
        Random r = new Random();
        int computerInput = r.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1){
            System.out.println("User Won");
        }
        else{
            System.out.println("Computer Won");
        }

        System.out.println("User Input - " + userInput + " Computer Input - " + computerInput);
    }
}
