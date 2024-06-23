package A01;
import java.util.*;

/*
Find the smallest number in an array
Find the largest number in an array
Second Smallest and Second - Largest element in an array
Reverse a given array
Count frequency of each element in an array
Rearrange array in increasing-decreasing order
Calculate sum of the elements of the array
Rotate array by K elements - Block Swap Algorithm
Average of all elements in an array
Find the median of the given array
    Find the middle number:
    8 9 9 9 9 *10* 11 11 11 13 13 - odd

    4 5 *8 11* 12 21 - even
    (8 + 11) ÷ 2 = 9.5

Remove duplicates from a sorted array
Remove duplicates from unsorted array
Adding Element in an array
Find all repeating elements in an array
Find all non-repeating elements in an array
Find all symmetric pairs in array *LEFT*
Maximum product sub-array in an array
Replace each element of the array by its rank in the array
Sorting elements of an array by frequency
Rotation of elements of array - left and right
Finding equilibrium index of an array *LEFT*
Finding Circular rotation of an array by K positions *LEFT*
Sort an array according to the order defined by another array *LEFT*
Search an element in an array
Check if Array is a subset of another array or not
*/

public class TCS02 {
    public void Q01(int []A){
        // Second Smallest and Second-Largest element in an array
        bubbleSort(A);
        int secondSmallest = A[0];
        int secondLargest = A[A.length - 1];

        for(int i = 1; i < A.length; i++){
            if(A[i] > secondSmallest){
                secondSmallest = A[i];
                break;
            }
        }
        for(int i = A.length - 1; i >= 0; i--){
            if(A[i] < secondLargest){
                secondLargest = A[i];
                break;
            }
        }
        System.out.print(Arrays.toString(A) + "\nSecond smallest - " + secondSmallest + "\nSecond largest - " + secondLargest);
    }
    public void bubbleSort(int []A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length - 1 - i; j++){
                if(A[j] > A[j + 1]){
                    int replace = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = replace;
                }
            }
        }
    }

    public void Q02(int []A){
        // Count frequency of each element in an array
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(h.containsKey(A[i])){
                h.put(A[i], h.get(A[i]) + 1);
            }
            else{
                h.put(A[i], 1);
            }
        }
        System.out.println("Array elements - count");
        for(Map.Entry<Integer, Integer> traverse : h.entrySet()){
            System.out.println(traverse.getKey() + " - " + traverse.getValue());
        }
    }

    public double Q03(int []A){
        // Find the median of the given array
        if(A.length % 2 == 0){
            return (double)(A[(A.length - 1)/ 2] + A[A.length / 2]) / 2;
        }
        else{
            return A[A.length / 2];
        }
    }

    public void Q04(int []A){
        // Remove duplicates from a sorted array
        Stack<Integer> s = new Stack<>();
        s.push(A[0]);
        for(int i = 1; i < A.length; i++){
            if(s.peek() != A[i]){
                s.push(A[i]);
            }
        }
        System.out.println(s);
    }

    public void Q05(int []A){
        // Remove duplicates from a unsorted array
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(h.containsKey(A[i])){
                h.put(A[i], h.get(A[i]) + 1);
            }
            else{
                h.put(A[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> map : h.entrySet()){
            a.add(map.getKey());
        }
        System.out.println(a);
    }

    public void Q06(int []A){
        // Find all repeating elements in an array
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(h.containsKey(A[i])){
                h.put(A[i], h.get(A[i]) + 1);
            }
            else{
                h.put(A[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> map : h.entrySet()){
            if(map.getValue() > 1){
                a.add(map.getKey());
            }
        }
        System.out.println(a);
        // [1, 2, 5]
    }

    public void Q07(int [][]A){
        /*
        Find all symmetric pairs in array

        Input:
        (1,2),
        (2,1),
        (3,4),
        (4,5),
        (5,4)
        Output: (2,1) (5,4)
        2D Array - n-sized * 2
        */

    }

    public void Q08(int []A){
        // Maximum product sub-array in an array
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length - 1; i++){
            for(int j = i + 1; j < A.length; j++){
                int product = 1;
                for(int k = i; k <= j; k++){
                    product = product * A[k];
                }
                max = Math.max(max, product);
            }
        }
        System.out.println("Maximum sub-array sum - " + max);
    }

    public void Q09(int []A){
        // Replace each element of the array by its rank in the array
        int []B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);

        int []C = new int[B.length];
        for(int i = 0; i < A.length; i++){
            int num = A[i];
            for(int j = 0; j < A.length; j++){
                if(num == B[j]){
                    C[i] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(C));
    }

    public void Q10(int []A){
        // Sorting elements of an array by frequency

        int max = findMax(A);
        int []count = new int[max + 1];
        for(int i = 0; i < A.length; i++){
            count[A[i]]++;
        }
        int index = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                A[index++] = i;
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public int findMax(int []A){
        int max = A[0];
        for(int i = 1; i < A.length; i++){
            if(max < A[i]){
                max = A[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public void Q11(int []A, int position, String direction){
        /*
        Rotation of elements of array - left and right

        Example 1:
        Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
        Output: 6 7 1 2 3 4 5
        Explanation: array is rotated to right by 2 position .

        Example 2:
        Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left
        Output: 9 10 11 3 7 8
        Explanation: Array is rotated to right by 3 position.
        */
        direction = direction.toLowerCase();
        int []ans = new int[A.length];
        int index = 0;
        if(direction.equals("right")){
            for(int i = 0; i < A.length - position; i++){
                ans[position + index] = A[i];
                index++;
            }
            index = 0;
            for(int i = A.length - position; i < A.length; i++){
                ans[index] = A[i];
                index++;
            }
        }
        else{
            for(int i = position; i < A.length; i++){
                ans[index] = A[i];
                index++;
            }
            index = position;
            for(int i = 0; i < position; i++){
                ans[index] = A[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(ans));

    }

    public boolean binarySearch(int []A, int target){
        // Search an element in an array
        int low = 0, high = A.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(A[mid] == target){
                return true;
            }
            else if(A[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }

    public boolean checkSubset(int []parent, int []child){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < child.length; i++){
            if(h.containsKey(child[i])){
                h.put(child[i],h.get(child[i]) + 1);
            }
            else{
                h.put(child[i], 1);
            }
        }
        for(int i = 0; i < parent.length; i++){
            if(h.containsKey(parent[i])){
                h.put(parent[i], h.get(parent[i]) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> map : h.entrySet()){
            if(map.getValue() == 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TCS02 o = new TCS02();
        int []A = {7, 1, 1, 5, 2, 3, 6, 7, 4};
//        o.Q02(A);

//        int []B= {4, 5, 8, 11, 12, 21};
        int []B = {8, 9, 9, 9, 9, 10, 11, 11, 11, 13, 13};
//        System.out.println("median - " + o.Q03(B));
//        o.Q05(B);

        int []C = {1, 5, 5, 2, 3, 2, 4, 1, 6};
//        o.Q06(C);

        int []D = {1, 2, -3, 0, -4, -5};
//        o.Q08(D);

        int []E = {5, 2, 3, 1, 4};
//        o.Q09(E);

        int []F = {0, 1, 2, 5, 3, 2, 1, 0, 1, 2, 6, 0};
//        o.Q10(F);

        int []G = {3,7,8,9,10,11};
//        o.Q11(G, 3, "left");

        int []H = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(o.binarySearch(H, 6));

        int []I = {1, 2, 3, 4, 5, 6, 7};
        int []J = {1, 2, 3};
        System.out.println(o.checkSubset(I, J));
    }
}
