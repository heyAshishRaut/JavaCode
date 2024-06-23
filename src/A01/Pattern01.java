package A01;
import java.util.*;

public class Pattern01 {
    public void pattern01(){
        // solid square matrix
        int size = 6;
        // i --> row, j --> column
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print("*  ");
            }
            System.out.println( );
        }
    }

    public void pattern02(){
        // hollow square matrix
        int size = 6;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == 0 || j == 0 || i == size - 1 || j == size - 1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
    }

    public void pattern03(){
        // only diagonal element and remaining zero
        int size = 6;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                if(i == j){
                    System.out.print(i + "  ");
                }
                else{
                    System.out.print(0 + "  ");
                }
            }
            System.out.println( );
        }
    }

    public void pattern04(){
//        1  1  1  1  1
//        1  1  1  2  2
//        1  1  3  3  3
//        1  4  4  4  4
//        5  5  5  5  5
        int size = 5;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size - i; j++){
                System.out.print(1 + "  ");
            }
            for(int j = size - i + 1; j <= size; j++){
                System.out.print(i + "  ");
            }
            System.out.println( );
        }
    }

    public void pattern05(){
        int size = 5;
        int k = 1;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k + "  ");
                k++;
            }
            System.out.println( );
        }
    }

    public void pattern06(){
        int size = 5;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }
    }

    public void pattern07(){
        int size = 5;
        for(int i = size; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }
    }

    public void pattern08(){
        // odd
        int size = 5;
        for(int i = 1; i <= size / 2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println( );
        }
        for(int i = size / 2 + 1; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*  ");
            }
            System.out.println( );
        }

// *
// *  *
// *  *  *
// *  *
// *
    }

    public void pattern09(){
        int size = 6;
        for (int i = 0; i < size; i++){
            for (int j = size - i; j > 1; j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++ ){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    public void pattern10(){
        int size = 6;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                if(j == 1 && i > 1 || j == size && i > 1 || i == 1 && j > 1 && j < size || i == size / 2 + 1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
    }

    public int findPower(int a, int b){
        int finalResult = 0, result = 0, midNum = 0;
        if(b == 1){
            return a;
        }
        else{
            midNum = b / 2;
            result = findPower(a, midNum);
            finalResult = result * result;
            if(b % 2 != 0){
                return a * finalResult;
            }
            else{
                return finalResult;
            }
        }
    }

    public void diagonalSum(int [][]A){
        // 01 02 03 04
        // 05 06 07 08
        // 09 10 11 12
        // 13 14 15 16
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(i == j || i + j == A.length - 1){
                    sum = sum + A[i][j];
                }
            }
        }
        System.out.println("The sum of diagonal elements is " + sum);
    }

    // int result = Integer.parseInt(trial02);
    // String trial01 = Integer.toString(x);
    // String num01 = String.valueOf(num);

    /*
    public static void printASCII(){
        char var = 'A';
        System.out.println((int) var);
    }
    */

    // List <Integer> a = Arrays.asList(B);
    // int result2 = Arrays.compare(C1, C2); // 0 --> true, -1 --> false, if unequal then 1

    public void pascalTriangle(){
//        Enter size
        int size = 5;
//        square matrix
        int [][]A = new int[size][size];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(i >= j){
                    if(i == j || j == 0){
                        A[i][j] = 1;
                    }
                    else{
                        A[i][j] = A[i - 1][j] + A[i - 1][j - 1];
                    }
                }
            }
        }
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                System.out.print(A[i][j] + "  ");
            }
            System.out.println( );
        }
//        Output -
//        1
//        1  1
//        1  2  1
//        1  3  3  1
//        1  4  6  4  1
    }

    public void method(){
        int result = Integer.parseInt("12345");
        System.out.println(result);

        String answer = String.valueOf(123);
        System.out.println(answer);
    }

//    primitive to Object
//    int i = 10;
//    Integer intVal = Integer.valueOf(i);
//    System.out.println(intVal);

//    Object to Primitive
//    Integer intVal = 10;
//    int i = intVal.intValue();

    public static void main(String[] args) {
        Pattern01 obj = new Pattern01();
//        obj.nonRepeatingNumber(new int[]{1, 2, 3, 2, 1, 4, 5, 5});
//        obj.firstRepeatingNumber(new int[]{1, 2, 2, 1, 3, 4, 5});
//        obj.pattern08();
//        System.out.println(obj.findPower(2, 2));
//        int [][]A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        obj.diagonalSum(A);


    }
}

