package A01;

import java.util.Arrays;

public class Strings02 {
    public static void Strings01(){
        String s01 = "Ashish"; //String constant pool
        String s02 = new String("Ashish"); //HeapArea
        System.out.println(s02 == s01); //Check reference
        System.out.println(s01.equals(s02)); //Check content
    }
    public static void Strings02(){
        String s03 = new String("AshishRaut");
        String s04 = new String("AshishRaut");
        System.out.println(s03 == s04);
        String s05 = "HelloAshish";
        String s06 = "HelloAshish";
        System.out.println(s05 == s06);
    }
    public static void Strings03(){
        String s07 = new String("Ashish");
        s07.concat("Raut");
        System.out.println(s07);

        String s08 = new String("Ashish");
        s08 = s08.concat(" Raut");
        System.out.println(s08);
    }
    public static void Case01(){
        // i/ --> Hello o/p --> olleH

        String sAd01 = "Hello";
        String sAd02 = "";
        for(int i = sAd01.length() - 1; i >= 0; i--){
            sAd02 = sAd02 + sAd01.charAt(i);
        }
        System.out.println(sAd02);
    }
    public static void Case02(){
        // i/p --> Ashish Raut o/p --> Raut Ashish

        String sAd03 = "Ashish Raut";
        String sAd04 = "";
        String []arr = sAd03.split(" ");
        for(int i = arr.length - 1; i >= 0; i--){
            sAd04 = sAd04 + arr[i] + " ";
        }
        System.out.println(sAd04);
    }
    public static void Case03(){
        // i/p --> Ashish Raut o/p --> tuaR hsihsA

        String sAd05 = "Ashish Raut";
        String sAd06 = "";
        for(int i = sAd05.length() - 1; i >= 0; i--){
            sAd06 = sAd06 + sAd05.charAt(i);
        }
        System.out.println(sAd06);
    }
    public static void Case04(){
        // i/p --> Ashish Raut o/p --> hsihsA tuaR

        String sAd07 = "Ashish Raut";
        String sAd08 = "";
        String []arr = sAd07.split(" ");
        for(String element : arr){
            for(int i = element.length() - 1; i >= 0; i--){
                sAd08 = sAd08 + element.charAt(i);
            }
            sAd08 = sAd08 + " ";
        }
        System.out.println(sAd08);
    }
    public static void Palindrome(){
        // Reading from forward or backward gives same output
        String check01 = "Ashish";
        String check02 = "";
        for(int i = check01.length() - 1; i >= 0; i--){
            check02 = check02 + check01.charAt(i);
        }
        if(check01.equals(check02)){
            System.out.println("It's an Palindrome");
        }
        else{
            System.out.println("Not an Palindrome");
        }
    }
    public static void Anagram(){
//        Rearranging original words to create new words
//        01. Remove spaces
//        02. Convert to Lower/UpperCase
//        03. Convert to array
//        04. Sort
//        05. Compare array
        String check03 = "School Master";
        String check04 = "The Classroom";

        check03 = check03.replace(" ", "");
        check04 = check04.replace(" ", "");

        check03 = check03.toLowerCase();
        check04 = check04.toLowerCase();

        char []arr03 = check03.toCharArray();
        char []arr04 = check04.toCharArray();

        Arrays.sort(arr03);
        Arrays.sort(arr04);

        System.out.println(Arrays.equals(arr03, arr04));
    }
    public static void Pangram(){
        String check05 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        boolean flag = false;

        check05 = check05.replace(" ", "");
        char []arr05 = check05.toCharArray();

        int []arr06 = new int[26];
        for(int i = 0; i <arr05.length; i++){
            arr06[arr05[i] - 65]++;
        }
        for(int i = 0; i < arr06.length; i++){
            if(arr06[i] == 0){
                System.out.println("Not an Pangram");
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("It's an Pangram");
        }
    }
    public static void main(String[] args) {
//        Strings01();
//        Strings02();
//        Strings03();

//        Case01();
//        Case02();
//        Case03();
//        Case04();
//        Palindrome();
//        Anagram();
        Pangram();
    }
}
