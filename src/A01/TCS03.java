package A01;
import java.util.*;

/*
Check if a number is palindrome or not
Find all Palindrome numbers in a given range
Check if a number is prime or not
Prime numbers in a given range
Check if a number is armstrong number of not
Check if a number is perfect number
Even or Odd
Check weather a given number is positive or negative
Sum of first N natural numbers
Find Sum of AP Series *
Program to find sum of GP Series *
Greatest of two numbers
Greatest of three numbers
Leap Year or not
Reverse digits of a number
Maximum and Minimum digit in a number
Print Fibonacci unto Nth Term
Factorial of a number
Power of a number
Factors of a given number
Print all prime factors of the given number
Check if a number is a strong number or not
Check if a Number is Automorphic
GCD of two numbers *
LCM of two numbers
Check if a number is Harshad number
Check if the number is abundant number or not
Sum of digits of a number
Sum of numbers in the given range
Permutations in which N people can occupy R seats in a classroom
Program to add two fractions
Replace all 0s with 1s in a given integer
Can a number be expressed as a sum of two prime numbers
Calculate the area of circle
Program to find roots of a Quadratic Equation
*/

public class TCS03{
    public boolean Q01(int num){
        // Check if a number is palindrome or not
        String str = Integer.toString(num);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public void Q02(int low, int high){
        // Find all Palindrome numbers in a given range

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = low; i <= high; i++){

            String str = Integer.toString(i);
            boolean check = true;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) != str.charAt(str.length() - 1 - j)){
                    check = false;
                    break;
                }
            }
            if(check){
                ans.add(Integer.parseInt(str));
            }

        }
        System.out.println(ans);
    }

    public boolean Q03(int num){
        // Check if a number is prime or not
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
            if(count > 2){
                return false;
            }
        }
        return true;
    }

    public void Q04(int low, int high){
        // Prime numbers in a given range
        ArrayList<Integer> a = new ArrayList<>();
        if(low == 1){
            a.add(1);
        }
        for(int i = low; i <= high; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
                if(count > 2){
                    break;
                }
            }
            if(count == 2){
                a.add(i);
            }
        }
        System.out.println(a);
    }

    public void Q05(int num){
        // Check if a number is armstrong number of not
        int ans = 0;
        int size = Integer.toString(num).length();
        int verify = num;
        while(num > 0){
            int digit = num % 10;
            ans = ans + (int)Math.pow(digit, 4);
            num = num / 10;
        }
        if(ans == verify){
            System.out.println("Its an Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }

    public void Q06(int num){
        // Check if a number is perfect number
        int ans = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                ans = ans + i;
            }
        }
        if(ans == num){
            System.out.println("Its an perfect number");
        }
        else{
            System.out.println("Not an perfect number");
        }
    }

    public void Q07(int num){
        // Sum of first N natural numbers
        int ans = 0;
        for(int i = 1; i <= num; i++){
            ans = ans + i;
        }
        System.out.println("Answer 1 - " + ans);

        int ans2 = (num * (num + 1)) / 2;
        System.out.println("Answer 2 - " + ans2);
    }

    public void Q08(int num01, int num02){
        // Greatest of two numbers
        int ans = Math.max(num01, num02);
        System.out.println(ans);
    }

    public void Q09(int num01, int num02, int num03){
        // Greatest of three numbers
        if(num01 > num02 && num01 > num03){
            System.out.println("num01");
        }
        else if(num02 > num01 && num02 > num03){
            System.out.println("num02");
        }
        else{
            System.out.println("num03");
        }
    }

    public void Q10(int year){
        // Leap Year or not
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }

    public void Q11(int num){
        // Reverse digits of a number
        String str = Integer.toString(num);
        String reverse_str = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse_str = reverse_str + str.charAt(i);
        }
        System.out.println(Integer.parseInt(reverse_str));
    }

    public void Q12(int num){
        // Maximum and Minimum digit in a number
        TreeSet<Integer> t = new TreeSet<>();
        while(num > 0){
            t.add(num % 10);
            num = num / 10;
        }
        System.out.print("Maximum digit - " + t.last() + "\nMinimum digit - " + t.first());
    }

    public int Q13(int num){
        // Print Fibonacci unto Nth Term
        if(num == 0 || num == 1){
            return num;
        }
        else{
            return Q13(num - 1) + Q13(num - 2);
        }
    }

    public void Q14(int num){
        // Print all prime factors of the given number
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                int count = 0;
                for(int j = 1; j <= i; j++){
                    if(i % j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    a.add(i);
                }
            }
        }
        System.out.println(a);
    }

    public void Q15(int num){
        // Print all prime factors of the given number
        int verify = num;
        int ans = 0;
        while(num > 0){
            int digit = num % 10;
            int mul = 1;
            for(int i = 1; i <= digit; i++){
                mul = mul * i;
            }
            ans = ans + mul;
            num = num / 10;
        }
        if(verify == ans){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }

    public void Q16(int num){
        // Check if a Number is Automorphic number - square ends with the given integer
        int size = Integer.toString(num).length();
        int square = (int)Math.pow(num, 2);
        int power = (int)Math.pow(10, size);
        int rem = square % power;

        if(rem == num){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not a Automorphic number");
        }
    }

    public int firstNonRepeating(int []arr, int n) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i]) + 1);
            }
            else{
                h.put(arr[i], 1);
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(h.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return 0;
    }

    public String isSubset( long []a1, long []a2, long n, long m) {
        HashSet<Long> h = new HashSet<>();
        for(int i = 0; i < a1.length; i++){
            h.add(a1[i]);
        }
        int size01 = h.size();
        for(int i = 0; i < a2.length; i++){
            h.add(a2[i]);
        }
        int size02 = h.size();

        if(size01 == size02){
            return "Yes";
        }
        else{
            return "No";
        }
    }

    public void findSubset(int [][]A){
        for(int i = 0; i < A.length - 1; i++){
            for(int j = i + 1; j < A.length; j++){
                if(A[i][0] == A[j][1] && A[i][1] == A[j][0]){
                    System.out.println("{" + A[i][0] + " , " + A[i][1] + "}");
                    System.out.println("{" + A[j][0] + " , " + A[j][1] + "}");
                }
            }
        }
    }

    public void countSamples(int []rock, int [][]range){
        int sample01 = 0, sample02 = 0;
        for(int i = 0; i < rock.length; i++){
            if(rock[i] >= range[0][0] && rock[i] <= range[0][1]){
                sample01++;
            }
            else if(rock[i] >= range[1][0] && rock[i] <= range[1][1]){
                sample02++;
            }
        }
        System.out.println(sample01 + " , " + sample02);
    }

    public void reverseArray(int []A){
        for(int i = 0; i < A.length / 2; i++){
            int replace = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = replace;
        }
    }

    public void binaryToDecimal(int bin){
        int size = Integer.toString(bin).length();

        int ans = 0;
        for(int i = 0; i < size; i++){
            int digit = bin % 10;
            ans = ans + (digit * (int)Math.pow(2, i));
            bin = bin / 10;
        }
        System.out.println("Decimal - " + ans);
    }

    public void binaryToOctal(int bin){ // LEFT
        // Convert binary to octal
        int size = Integer.toString(bin).length();

        int ans = 0;
        for(int i = 0; i < size; i++){
            int digit = bin % 10;
            ans = ans + (digit * (int)Math.pow(2, i));
            bin = bin / 10;
        }

        String octalReverse = "";
        while(ans > 0){
            int digit = ans % 8;
            octalReverse = octalReverse + digit;
            ans = ans / 10;
        }
        String octal = "";
        for(int i = octalReverse.length() - 1; i >= 0; i--){
            octal = octal + octalReverse.charAt(i);
        }
        System.out.println(octal);
    }

    public static void main(String[] args) {
        TCS03 o = new TCS03();

//        int num = 123532;
//        System.out.println(o.Q01(num));
//        o.Q02(100, 150);
//        System.out.println(o.Q03(7));
//        o.Q04(1, 25);
//        o.Q05(9475);
//        o.Q06(28);
//        o.Q07(5);
//        o.Q11(123);
//        o.Q12(45215);
//        System.out.println("Fibonacci of N - " + o.Q13(6));
//        o.Q14(12);
//        o.Q15(145);
        o.Q16(4);
    }
}

