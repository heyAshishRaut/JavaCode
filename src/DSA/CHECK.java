package DSA;
import java.util.*;

public class CHECK {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>();
        al.add('A');
        al.add('B');
        al.add('C');

        al.set(1, 'Z');
        System.out.println(al);

    }
}
