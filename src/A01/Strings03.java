package A01;
import java.util.*;

public class Strings03 {
    public static void main(String[] args) {
        String s01 = "ASHISH";
        System.out.println(s01.charAt(2));
//        Returns the character at the specified index (position)
//        H
        System.out.println(s01.codePointAt(0));
//        Returns the Unicode of the character at the specified index
//        65
        String s02 = "HELLO";
        String s03 = "HELLO";
        System.out.println(s02.compareTo(s03));
//        The method returns 0 if the string is equal to the other string.
//        A value less than 0 is returned if the string is less than the other
//        string (less characters) and a value greater than 0 if the string is
//        greater than the other string (more characters).
//        0
        String s04 = "Hello";
        System.out.println(s02.compareToIgnoreCase(s04));
//        0

        System.out.println(s04.contains("ll"));
//        checks whether a string contains a sequence of characters.
//        true

        String s05 = "Ashish";
        System.out.println(s05.contentEquals("Ashish"));
//        true
        System.out.println(s05.contentEquals("Ash"));
//        false

        char []A = {'A', 'S', 'H', 'I', 'S', 'H'};
        String s06 = "";
        s06 = s06.copyValueOf(A, 0, A.length);
        System.out.println(s06);
//        ASHISH

        char []B = {'F', 'U', 'S', 'I', 'O', 'N'};
        String s07 = "";
        s07 = s07.copyValueOf(B);
        System.out.println(s07);
//        FUSION

        String s08 = "hello";
        System.out.println(s08.endsWith("he"));
//        false
        System.out.println(s08.endsWith("lo"));
//        true

        String s09 = "ASHISH";
        String s10 = "Ashish";
        System.out.println(s09.equals(s10));
//        false
        System.out.println(s09.equalsIgnoreCase(s10));
//        true

        String s11 = "My name is Ashish raut";
        System.out.println(s11.indexOf("raut"));
//        18

        System.out.println(s08.length()); //hello
//        5

        String s12 = "hello";
        System.out.println(s12.replace('l', 'O'));
//        heOOo

        System.out.println(s12.replaceFirst("l", "O"));
//        heOlo

        System.out.println(s12.startsWith("he"));
//        true

        System.out.println(s12.subSequence(1, 2));
//        e

        System.out.println(s12.substring(1));
//        ello

        System.out.println(s12.substring(1, 2));
//        e

//        Note -
//        A subarray or substring will always be contiguous, but a subsequence
//        need not be contiguous.

        String s13 = "AshIsh";
        System.out.println(s13.toLowerCase());
//        ashish

        System.out.println(s13.toUpperCase());
//        ASHISH

        char []C = {'a', 's', 'h', 'i', 's', 'h'};
        System.out.println(Arrays.toString(C));
//        [a, s, h, i, s, h]

        String s14 = " ashish ";
        System.out.println(s14.trim());
//        Removes whitespace from both ends of a string

        StringBuffer s15 = new StringBuffer("ashish");
        s15.setCharAt(1, 'S');
        System.out.println(s15);
//        aShish

        s15.insert(1, "hello");
        System.out.println(s15);
//        ahelloShish

    }
}

