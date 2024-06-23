package A01;
import java.util.*;

public class Arrays02 {
    public static void method01(int []A){

    }
    public static void prefixSum(int []A){
        for(int i = 1; i < A.length; i++){
            A[i] = A[i] + A[i - 1];
        }
        System.out.println(Arrays.toString(A));
    }

    public static void suffixSum(int []A){
        for(int i = 0; i < A.length - 1; i++){
            A[i] = A[i] + A[i + 1];
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
//        1-D ARRAYS
//        Anonymous array creation
        Arrays02.method01(new int []{1, 2, 3, 4, 5});

//        for - each loop
        int []A = {1, 2, 3, 4, 5};
        for(int var : A){
            System.out.print(var + "  ");
        }
//        Output - 1  2  3  4  5

        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + "  ");
        }
//        Output - 1  2  3  4  5

//        asList method --> Arrays to List
        Integer []B = {1, 2, 3, 4, 5};
        List <Integer> a = Arrays.asList(B);
        System.out.println( );
        System.out.println(a);

//        binarySearch method
        int val = 5;
        int result1 = Arrays.binarySearch(B, val); // returns index of val if present
        System.out.println(result1);

//        compare Arrays
        int []C1 = {1, 2, 3, 4, 5};
        int []C2 = {1, 2, 3, 4, 5};

        int result2 = Arrays.compare(C1, C2); // 0 --> true, -1 --> false, if unequal then 1
        System.out.println(result2);

//        toString method
        char []D = {'a', 'b', 'c'};
        String b = Arrays.toString(D);
        System.out.println(b);
//        Output - [a, b, c]

        int var = 10;
        String c = Integer.toString(var);
        System.out.println(c);
        for(int i = 0; i < c.length(); i++){
            System.out.print(c.charAt(i) + "  ");
        }
//        Output - 1  0

//        copyOf, and copyOfRange method
        int []E = {1, 2, 3, 4, 5};
        int []copyOf1 = Arrays.copyOf(E, E.length); // arrayName, newLength
        System.out.println(Arrays.toString(copyOf1));

        int []copyOf2 = Arrays.copyOf(E, 10);
        System.out.println(Arrays.toString(copyOf2));

        int []copyOfRange1 = Arrays.copyOfRange(E, 2, 3);
        System.out.println(Arrays.toString(copyOfRange1));

//        equal method
        int []F1 = {1, 2, 3};
        int []F2 = {1, 2, 3};
        boolean result3 = Arrays.equals(F1, F2); // return boolean
        System.out.println(result3);

//        fill method
        int []G = {1, 2, 3, 4, 5};
        Arrays.fill(G, 10);
        System.out.println(Arrays.toString(G));
//        Output - [10, 10, 10, 10, 10]

//        mismatch method
        int []H1 = {1, 2, 3, 4, 5};
        int []H2 = {1, 2, 3, 5};
        int mismatch1 = Arrays.mismatch(H1, H2); // return index where mismatch happens
        System.out.println(mismatch1);
//        Output - 3

//        parallelSort method
        /* it uses a parallel sort-merge sorting algorithm.
        It breaks the array into sub-arrays that are themselves sorted and then merged. */
        int []I = {5, 1, 3, 2, 7, 6, 9};
        Arrays.parallelSort(I);
        System.out.println(Arrays.toString(I));
//        [1, 2, 3, 5, 6, 7, 9]

        Arrays.sort(I);
        System.out.println(Arrays.toString(I));
//        [1, 2, 3, 5, 6, 7, 9]

        prefixSum(new int[]{1, 1, 1, 1, 1});
//        [1, 2, 3, 4, 5]

        suffixSum(new int[]{1, 1, 1, 1, 1});
//        [2, 2, 2, 2, 1]
    }
}

