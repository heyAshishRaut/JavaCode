package A01;
import java.util.*;

public class Recursion01 {
    public static int fibonacciSeries(int num){
        if(num == 0 || num == 1){
            return num;
        }
        else{
            return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
        }
    }

    public static void primeNumber(int num){
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }

    public static void palindrome(int num){
        String num01 = String.valueOf(num);
        String num02 = "";
        for(int i = num01.length() - 1; i >= 0; i--){
            num02 = num02 + num01.charAt(i);
        }
        if(num01.equals(num02)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

    public static void factorial(int num){
        int result = 1;
        for(int i = num; i > 0; i--){
            result = result * i;
        }
        System.out.println(result);
    }

    public static void armstrongNum(int num){
        int count = 0;
        int temp = num;
        int check = num;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        double result = 0;
        while(num > 0){
            int number = num % 10;
            double power = Math.pow(number, count);
            result = result + power;
            num = num / 10;
        }
        if(check == result){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }

    public static void generateRandomNum(){
        Random r = new Random();
        int num = r.nextInt(100);
        System.out.println(num);
    }

    public static void compareObject(){
//        01 in string constant pool
        String s01 = "Hello";
        String s02 = "Hello";
        System.out.println("Comparing content");
        System.out.println(s01.equals(s02));
        System.out.println("Comparing references");
        System.out.println(s01 == s02);

//        02 in heap area
        String s03 = new String("World");
        String s04 = new String("World");
        System.out.println("Comparing content");
        System.out.println(s03.equals(s04));
        System.out.println("Comparing references");
        System.out.println(s03 == s04);
    }

    public static void printASCII(){
        char var = 'A';
        System.out.println((int) var);
    }

    public static void reverseNum(int num){
        String num01 = String.valueOf(num);
        String num02 = "";
        for(int i = num01.length() - 1; i >= 0; i--){
            num02 = num02 + num01.charAt(i);
        }
        int result =Integer.parseInt(num02);
        System.out.println(result);
    }

    public static void numToWord(int num){
        int count = 0;
        int temp = num;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        String num01 = String.valueOf(num);
        for(int i = 0; i < num01.length() && count > 0; i++){
            switch (num01.charAt(i)) {
                case '0' -> System.out.print("Zero ");
                case '1' -> System.out.print("One ");
                case '2' -> System.out.print("Two ");
                case '3' -> System.out.print("Three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six");
                case '7' -> System.out.print("Seven ");
                case '8' -> System.out.print("Eight");
                default -> System.out.print("Nine");
            }
//            if(count == 6){
//                System.out.print(" Lakh ");
//            }
//            else if(count == 5){
//                System.out.print(" Ten Thousand ");
//            }
//            else if(count == 4){
//                System.out.print(" Thousand ");
//            }
//            else if(count == 3){
//                System.out.print(" Hundred ");
//            }
//            else if(count == 2){
//                System.out.print(" Ten ");
//            }
//            else if(count == 1){
//                System.out.print(" Ones ");
//            }
            count--;
        }
    }

    public static void automorphicNumber(int num){
//      integer whose square ends with the given integer, as (25)2 = 625, and (76)2 = 5776
        int square = num * num;
        HashSet<Integer> hs = new HashSet<>();
        int count = 2;
        while(count > 0){
            int n01 = num % 10;
            hs.add(n01);
            num = num / 10;
            int n02 = square % 10;
            hs.add(n02);
            square = square / 10;
            count--;
        }
        if(hs.size() == 2){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not an Automorphic number");
        }
    }

    public static void petersonNum(int num){
//      if the sum of factorials of each digit of the number is equal to the number itself.
        int check = num;
        int result = 0;
        while(num > 0){
            int temp = num % 10;
            int fact = 1;
            for(int i = 1; i <= temp; i++){
                fact = fact * i;
            }
            result = result + fact;
            num = num / 10;
        }
        if(check == result){
            System.out.println("Peterson number");
        }
        else{
            System.out.println("Not an Peterson number");
        }
    }

    public static void sunnyNumber(int num){
//      if the number next to the given number is a perfect square.
        int numPlusOne = num + 1;
        int result = (int)Math.pow(numPlusOne, 0.5);
        int check = result * result;
        if(check == numPlusOne){
            System.out.println("Sunny number");
        }
        else{
            System.out.println("Not an sunny number");
        }
    }

    public static void techNumber(int num){
        int check = num, result = num;
        int count = 0;

        while (check > 0){
            count++;
            check = check / 10;
        }

        if(count % 2 != 0){
            System.out.println("Not an Tech Number");
            return;
        }

        int breakMid = count / 2;
        String number = String.valueOf(num);

        String n01 = "";
        String n02 = "";
        for(int i = 0; i < breakMid; i++){
            n01 = n01 + number.charAt(i);
        }
        for(int i = breakMid; i < number.length(); i++){
            n02 = n02 + number.charAt(i);
        }

        int num01 = Integer.parseInt(n01);
        int num02 = Integer.parseInt(n02);

        int perform = num01 + num02;
        int sq = (int)Math.pow(perform, 2);

        if(sq == result){
            System.out.println("Tech number");
        }
        else{
            System.out.println("Not an Tech number");
        }
    }

    public static void fascinatingNum(int num){
        boolean check = true;
        int case01 = num * 2;
        int case02 = num * 3;
        String c01 = String.valueOf(case01);
        String c02 = String.valueOf(case02);

        String result = num + c01 + c02;
        System.out.println(result);
        char []A = result.toCharArray();
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++){
            if(A[i] != i + 1){
                System.out.println("Not an fascinating number");
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Its an fascinating number");
        }
    }

    public static void alternatePrimeNum(int upperLimit){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i < upperLimit; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                al.add(i);
            }
        }
        for(int i = 0; i < al.size(); i++){
            if(i % 2 == 0){
                System.out.print(al.get(i) + "   ");
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(fibonacciSeries(10));
//        primeNumber(6);
//        palindrome(12321);
//        factorial(5);
//        armstrongNum(125);
//        generateRandomNum();
//        compareObject();
//        printASCII();
//        reverseNum(123);
//        numToWord(123);
//        automorphicNumber(13);
//        petersonNum(145);
//        sunnyNumber(13);
//        techNumber(1312);
//        fascinatingNum(327);
//        alternatePrimeNum(40);
    }
}

