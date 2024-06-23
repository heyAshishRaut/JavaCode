package A01;
import java.util.Scanner;

class Guesser{
    int gNum;
    public int GuesserNum(){
        Scanner s = new Scanner(System.in);
        System.out.println("Guesser - Enter a Number");
        gNum = s.nextInt();
        return gNum;
    }
}
class Player{
    int pNum;
    public int playerNum(){
        Scanner s =new Scanner(System.in);
        System.out.println("Player - Enter a Number");
        pNum = s.nextInt();
        return pNum;
    }

}
class Umpire{
    int gNum;
    int p01, p02, p03;
    public void getNum(){
        Guesser g = new Guesser();
        gNum = g.GuesserNum();

        Player obj01 = new Player();
        p01 = obj01.playerNum();

        Player obj02 = new Player();
        p02 = obj02.playerNum();

        Player obj03 = new Player();
        p03 = obj03.playerNum();
    }
    public void compareNum(){
        if(gNum == p01){
            if(gNum == p02 && gNum == p03){
                System.out.println("All player guess the correct number");
            }
            else if(gNum == p02){
                System.out.println("P01 and P02 guess the correct number");
            }
            else if(gNum == p03){
                System.out.println("P01 and P03 guess the correct number");
            }
            else{
                System.out.println("Only P01 guess the correct number");
            }
        }
        else if(gNum == p02){
            if(gNum == p03){
                System.out.println("P02 and P03 guess the correct number");
            }
            else{
                System.out.println("Only P02 guess the correct number");
            }
        }
        else{
            System.out.println("Only P03 guess the correct number");
        }
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.getNum();
        u.compareNum();
    }
}