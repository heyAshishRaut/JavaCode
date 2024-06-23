package A01;
import java.util.*;

public class TCS01 {
    public int Q01(int []A){
        // smallest number in an array
        int small = A[0];
        for(int i = 1; i < A.length; i++){
            if(A[i] < small){
                small = A[i];
            }
        }
        return small;
    }

    public int Q02(int []A){
        // largest number in an array
        int large = A[0];
        for(int i = 1; i < A.length; i++){
            if(A[i] > large){
                large = A[i];
            }
        }
        return large;
    }

    public int[] Q03(int []A){
        int []ans = new int[2];
        Arrays.sort(A);
        for(int i = 0; i < A.length - 1; i++){
            if(A[i + 1] > A[i]){
                ans[0] = A[i + 1];
                break;
            }
        }
        for(int i = A.length - 1; i > 0; i--){
            if(A[i - 1] < A[i]){
                ans[1] = A[i - 1];
                break;
            }
        }
        return ans;
    }

    public int[] Q04(int []A){
        // reverse the array
        for(int i = 0; i < A.length / 2; i++){
            int replace = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = replace;
        }
        return A;
    }

    public void Q05(int []B){
        // count frequency
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < B.length; i++){
            if(h.containsKey(B[i])){
                h.put(B[i], h.get(B[i]) + 1);
            }
            else{
                h.put(B[i], 1);
            }
        }
        System.out.println(h);
    }

    public void Q06(int []A){
        // Rearrange array in increasing-decreasing order
        Arrays.sort(A);
        int []B = new int[A.length];
        int index = 0;
        for(int i = 0; i < A.length / 2; i++){
            B[index] = A[i];
            index++;
        }
        for(int i = A.length - 1; i >= A.length / 2; i--){
            B[index] = A[i];
            index++;
        }
        System.out.println(Arrays.toString(B));
    }

    public int Q07(int []A){
        // array element sum
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum = sum + A[i];
        }
        return sum;
    }

    public int Q08(int []A){
        // array element average
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum = sum + A[i];
        }
        return sum / A.length;
    }

    public double Q09(int []A){
        // find median
        Arrays.sort(A);
        int size = A.length;
        if(size % 2 == 0){
            int idx01 = (size / 2) - 1;
            int idx02 = size / 2;
            return (double) (A[idx01] + A[idx02]) / 2;
        }
        else{
            return A[A.length / 2];
        }
    }

    public void Q10(int []A){
        // Remove Duplicates in-place from Sorted Array
        int index = 0;
        for(int i = 0; i < A.length - 1; i++){
            A[index] = A[i];
            for(int j = i + 1; j < A.length; j++){
                if(A[i] == A[j]){
                    A[j] = Integer.MAX_VALUE;
                }
                else{
                    break;
                }
            }
            index++;
        }
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }

    public void Q11(int []A){
        // Remove Duplicates in-place from UnSorted Array
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < A.length - 1; i++){
            a.add(A[i]);
            for(int j = i + 1; j < A.length; j++){
                if(A[i] == A[j]){
                    i++;
                }
            }
        }
        System.out.println(a);
    }

    public void Q12(int index, int element, ArrayList<Integer> A){
        A.add(index, element);
    }

    public void insertAtBeginning(int element, int []A, int totalNoOfElement){
        for(int i = totalNoOfElement; i > 0; i--){
            A[i] = A[i - 1];
        }
        A[0] = element;
        System.out.println(Arrays.toString(A));
    }

    public void Q13(int index, int element, int []A){
        // adding elements in an array
        // general array of size 10
        int totalNoOfElement = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > 0){
                totalNoOfElement++;
            }
        }
        if(index == 0){
            insertAtBeginning(element, A, totalNoOfElement);
        }
    }

    public void Q14(int []A){
        // finding repeating elements in an array

        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(!h.containsKey(A[i])){
                h.put(A[i], 1);
            }
            else{
                h.put(A[i], h.get(A[i]) + 1);
            }
        }
        for(int i : h.keySet()){
            if(h.get(i) > 1){
                System.out.print(i + " ");
            }
        }
    }

    public void Q15(int []A){
        // finding non - repeating elements in an array

        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(!h.containsKey(A[i])){
                h.put(A[i], 1);
            }
            else{
                h.put(A[i], h.get(A[i]) + 1);
            }
        }
        for(int i : h.keySet()){
            if(h.get(i) == 1){
                System.out.print(i + " ");
            }
        }
    }

    public void Q16(){
        int [][]A = {
                {1, 5},
                {2, 3},
                {4, 2},
                {5, 1},
                {2, 4}
        };
        int count = 0;
        for(int row01 = 0; row01 < A.length - 1; row01++){
            for(int row02 = row01 + 1; row02 < A.length; row02++){
                if(A[row01][0] == A[row02][1] && A[row01][1] == A[row02][0]){
                    System.out.println(A[row02][0] + " " + A[row02][1]);
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    public void Q17(int []A){
        int []B = new int[A.length];
        for(int i = 0; i < B.length; i++){
            B[i] = A[i];
        }
        Arrays.sort(A);
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < A.length; j++){
                if(B[i] == A[j]){
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []A = {20, 15, 26, 2, 98, 6};
        TCS01 obj = new TCS01();

//        System.out.println(obj.Q01(A));
//        System.out.println(obj.Q02(A));
//        int []ans01 = obj.Q03(A);
//        System.out.println(ans01[0] + " " + ans01[1]);
//        int []ans02 = obj.Q04(A);
//        for(int i = 0; i < A.length; i++){
//            System.out.print(ans02[i] + " ");
//        }
//        System.out.println( );
//        int []B = {1, 2, 1, 3, 3, 4, 6, 5, 6};
//        obj.Q05(B);
//        obj.Q06(A);
//        System.out.println(obj.Q07(A));
//        System.out.println(obj.Q08(A));
//        System.out.println(obj.Q09(A));
//        obj.Q10(A);
//        obj.Q11(A);
//        int []X = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
//        obj.Q13(0, -1, X);
//        obj.Q15(A);
//        obj.Q16();
        obj.Q17(A);

    }
}
