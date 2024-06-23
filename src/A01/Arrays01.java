package A01;
import java.util.*;
class Array{
    public static void Que03(){
//        03. Find how many numbers are greater than X
        int [] arr01= {4, 7, 1, 5, 3, 9, 2, 8, 6};
        int x = 5;
        int count = 0;

        for(int i = 0; i < arr01.length; i++){
            if(arr01[i] > x){
                System.out.print(arr01[i] + "  ");
                count++;
            }
        }
        System.out.println( );
        System.out.println(count);
    }

    public static void Que04(){
//        04. Find whether array is sorted or not
        int []arr01 = {1, 2, 3, 1};
        boolean check = true;
        for(int i = 0; i < arr01.length - 1; i++){
            if(arr01[i] > arr01[i + 1]){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }

    public static void Que06(){
//        06. Sum of two element equal to given number
        int []arr01 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int equalSum = 8;
        int count = 0;
        for(int i = 0; i < arr01.length; i++){
            for(int j = i + 1; j < arr01.length; j++){
                if(arr01[i] + arr01[j] == equalSum){
                    System.out.println(arr01[i] + " + " + arr01[j] + " = " + equalSum);
                    count++;
                }
            }
        }
        System.out.println("The count is " + count);
    }

    public static void Que07(){
//        06. Sum of three element equal to given number
        int []arr01 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int equalSum = 12;
        int count = 0;
        for(int i = 0; i < arr01.length; i++){
            for(int j = i + 1; j < arr01.length; j++){
                for(int k = j + 1; k < arr01.length; k++){
                    if(arr01[i] + arr01[j] + arr01[k] == equalSum){
                        System.out.println(arr01[i] + " + " + arr01[j] +  " + " + arr01[k] + " = " + equalSum);
                        count++;
                    }
                }
            }
        }
        System.out.println("------------------");
        System.out.println("The count is " + count);
    }

    public static void Que08(){
//        09. Non - repeating number in an array
        int []arr01 = {1, 2, 3, 4, 3, 2, 1};
        for(int i = 0; i < arr01.length; i++){
            for(int j = i + 1; j < arr01.length; j++){
                if(arr01[i] == arr01[j]){
                    arr01[i] = 0;
                    arr01[j] = 0;
                }
            }
        }
        for(int i = 0; i < arr01.length; i++){
            if(arr01[i] != 0){
                System.out.println(arr01[i]);
            }
        }
    }

    public static void Que10(){
//        10. First repeating number
        int []arr01 = {1, 2, 3, 1, 3};
        for(int i = 0; i < arr01.length; i++){
            for(int j = i + 1; j < arr01.length; j++){
                if(arr01[i] == arr01[j]){
                    System.out.println("the first repeating number is " + arr01[i]);
                    return;
                }
            }
        }
    }


    public static void Que12(){
        int []arr01 = {1, 2, 3, 4, 5, 6};
        int size = arr01.length;
        int []arr02 = new int[size];
        int j = size - 1;
        for(int i = 0; i < size; i++){
            arr02[j] = arr01[i];
            j--;
        }
        for(int i = 0; i < size; i++){
            System.out.print(arr02[i] + "  ");
        }
    }
    public static void add2DArray(int [][]A, int [][]B){
        int [][]result = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                if(result[i][j] < 10){
                    System.out.print(" ");
                }
                System.out.print(result[i][j] + "  ");
            }
            System.out.println( );
        }
//        Output -
//         2   4   6
//         8  10  12
//        14  16  18
    }

    public static void mul2DArray(int [][]A, int [][]B){
        int [][]result = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                result[i][j] = A[i][j] * B[i][j];
            }
        }

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                if(result[i][j] < 10){
                    System.out.print(" ");
                }
                System.out.print(result[i][j] + "  ");
            }
            System.out.println( );
        }
//        Output -
//         1   4   9
//        16  25  36
//        49  64  81
    }
}
public class Arrays01 {
    public static void main(String[] args) {

    }
}

