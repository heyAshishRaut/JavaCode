package DSA;
import java.util.*;

public class A01 {
    public void Q01(){
        // numeric hollow half pyramid
        int num = 5;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if(i == num || i == j || j == 1){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }

    public void Q02(){
        // numeric hollow inverted half pyramid
        int num = 5;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if(j == 1){
                    System.out.print(i + " ");
                }
                else if(i == 1){
                    System.out.print(j + " ");
                }
                else if(i + j == num + 1){
                    System.out.print(num + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }

    public void Q03(int []A){
        // max sub-array sum KADANE'S ALGORITHM
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < A.length; i++){
            cs = cs + A[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum sub-array sum - " + ms);
    }

    public void Q04(int []height){
        // Water trapped
        int size = height.length;

        int []left = new int[size];
        left[0] = height[0];
        for(int i = 1; i < left.length; i++){
            left[i] = Math.max(height[i], left[i - 1]);
        }

        int []right = new int[size];
        right[size - 1] = height[size - 1];
        for(int i = size - 2; i >= 0; i--){
            right[i] = Math.max(height[i], right[i + 1]);
        }

        int waterTrap = 0;
        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(left[i], right[i]);
            waterTrap = waterTrap + (waterLevel -height[i]);
        }
        System.out.println(waterTrap);
    }

    public void Q05(int[] nums) {
        int size = nums.length;

        int []left = new int[size];
        int []right = new int[size];

        for(int i = 1; i < size; i++){
            left[i] = nums[i - 1] + left[i - 1];
        }

        for(int i = size - 2; i >= 0; i--){
            right[i] = nums[i + 1] + right[i + 1];
        }

        int []ans = new int[size];
        for(int i = 0; i < size; i++){
            int value = left[i] - right[i];
            ans[i] = Math.abs(value);
        }

        System.out.println(Arrays.toString(ans));
    }

    public String Q06(String word) {
        // a a a a b c d e
        String ans = "";
        Stack<Character> s = new Stack<>();
        s.push(word.charAt(0));
        for(int i = 1; i < word.length(); i++){
            char current = word.charAt(i);
            if(current != s.peek() || s.size() == 9){
                ans = ans + s.size() + s.peek();
                while(!s.isEmpty()){
                    s.pop();
                }
            }
            s.push(word.charAt(i));
        }
        if(!s.isEmpty()){
            ans = ans + s.size() + s.peek();
            while(!s.isEmpty()){
                s.pop();
            }
        }
        return ans;
    }

    public void Q07(int []A){
        // Move all negative numbers to left side of an array

        for(int i = 0; i < A.length - 1; i++){
            int idx = -1;
            for(int j = i + 1; j < A.length; j++){
                if(A[j] < 0){
                    idx = j;
                    break;
                }
            }
            if(idx != -1){
                int replace = A[i];
                A[i] = A[idx];
                A[idx] = replace;
            }
        }
        System.out.println(Arrays.toString(A));
    }

    public void Q08(int []A){
        // place all -ve numbers to the end without changing order of +ve and -ve numbers

        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            if(A[i] < 0){
                al.add(A[i]);
            }
        }
        int idx = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] >= 0){
                A[idx] = A[i];
                idx++;
            }
        }
        int al_idx = 0;
        for(int i = idx; i < A.length; i++){
            A[idx] = al.get(al_idx);
            al_idx++;
            idx++;
        }
        System.out.println(Arrays.toString(A));
    }

    public void Q09(int []A){
        // missing elements from an array with duplicates

        int max_num = -1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            if(max_num < A[i]){
                max_num = A[i];
            }
            hs.add(A[i]);
        }

        Object []hs_arr = hs.toArray();
        int hs_sum = 0;
        for(int i = 0; i < hs_arr.length; i++){
            hs_sum = hs_sum + (int)hs_arr[i];
        }

        int total = (max_num * (max_num + 1)) / 2;
        System.out.println(total - hs_sum);
    }

    public void Q10(int [][]A){
        // wave traverse
        /*
        1 2 3
        4 5 6
        7 8 9

        o/p --> 1 4 7 --> 8 5 2 --> 3 6 9
        */
        for(int col = 0; col < A[0].length; col++){
            for(int row = 0; row < A.length; row++){
                System.out.print(A[row][col] + " ");
            }
            col++;
            if(col == A[0].length){
                return;
            }
            for(int row = A.length - 1; row >= 0; row--){
                System.out.print(A[row][col] + " ");
            }
        }
    }

    public void Q11(int []A){
        // alternate swap an array

        // [1, 2, 3, 4, 5, 6, 7, 8]
        // [2, 1, 4, 3, 6, 5, 8, 7]

        for(int i = 0; i < A.length; i+=2){
            if(A[i] != A.length){
                int replace = A[i];
                A[i] = A[i + 1];
                A[i + 1] = replace;
            }
        }
        System.out.println(Arrays.toString(A));
    }

    public void Q12(int []A){
        // find unique element in an array, where all elements are present twice except one.

        for(int i = 0; i < A.length - 1; i+=2){
            if(A[i] != A[i + 1]){
                System.out.println(A[i]);
                return;
            }
        }
        if(A[A.length - 1] != A[A.length - 1 - 1]){
            System.out.println(A[A.length - 1]);
        }
        else{
            System.out.println(-1);
        }
    }

    public void Q13(int []A){
        // Given an array of size an N, containing number between 1 and N - 1,
        // there's single element present twice find out the element.

        // [1, 2, 3, 3, 4, 5]
        int total = ((A.length - 1) * (A.length)) / 2;
        int arr_sum = 0;
        for(int i = 0; i < A.length; i++){
            arr_sum = arr_sum + A[i];
        }
        System.out.println(arr_sum - total);
    }

    public void Q14(int []A, int []B){
        // Array interaction

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
        /*
        K V B
        1 1 2  2 2 3
        2 1 2
        3 0 3
        4 1 3
        */
        for(int i = 0; i < B.length; i++){
            if(h.containsKey(B[i]) && h.get(B[i]) > 0){
                a.add(B[i]);
                h.put(B[i], h.get(B[i]) - 1);
            }
        }
        System.out.println(a);
    }

    public int Q15(int []A, int target){
        // Search in sorted and Rotated array
        
        int low = 0, high = A.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(A[mid] >= A[0]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        if(A[low] == target){
            return low;
        }
        else if(A[low] < target && A[A.length - 1] < target){
            return binarySearch(0, low - 1, A, target);
        }
        else{
            return binarySearch(low, A.length - 1, A, target);
        }
    }

    public int binarySearch(int low, int high, int []A, int target){
        while(low <= high){
            int mid = (low + high) / 2;
            if(A[mid] == target){
                return mid;
            }
            else if(A[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void Q16(int[] arr){
        // Sort array of 0, 1 and 2

        int []count = new int[2 + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int idx = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[idx] = i;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void Q17(ArrayList<Integer> arr, int n, int k) {
        // First and last occurrence of an element in an array

        int []ans = new int[2];
        if(arr.size() == 1){
            if(arr.get(0) != k){
                ans[0] = -1;
                ans[1] = -1;
                System.out.println(Arrays.toString(ans));
                return;
            }
            else{
                System.out.println(Arrays.toString(ans));
                return;
            }
        }
        int ans01 = firstOccurrence(arr, n, k);
        ans[0] = ans01;
        int ans02 = lastOccurrence(arr, n, k);
        ans[1] = ans02;

        System.out.println(Arrays.toString(ans));
    }

    public int firstOccurrence(ArrayList<Integer> arr, int n, int k){
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr.get(mid) == k){
                ans = mid;
                high = mid - 1;
            }
            else if(arr.get(mid) < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public int lastOccurrence(ArrayList<Integer> arr, int n, int k){
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr.get(mid) == k){
                ans = mid;
                low = mid + 1;
            }
            else if(arr.get(mid) < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public int Q18(int[] arr) {
        // Peak element in mountain array --> [0,10,5,2] output - 1, return index
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        A01 obj = new A01();

//        obj.Q01();

//        obj.Q02();

//        int []A = {-2, -3, 4, -1, -2, 1, 5, -3};
//        obj.Q03(A);

//        int []A = {0,1,0,2,1,0,1,3,2,1,2,1};
//        obj.Q04(A);

//        int []A = {10,4,8,3};
//        obj.Q05(A);

//        String ans = obj.Q06("abcde");
//        System.out.println(ans);

//        int []A = {1, -1, 3, 2, -7, -5, 11, 6};
//        obj.Q07(A);

//        obj.Q08(A);

//        int []A = {1, 3, 5, 3, 4};
//        obj.Q09(A);

//        int [][]A = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        obj.Q10(A);

//        int []A = {1, 2, 3, 4, 5, 6, 7, 8};
//        obj.Q11(A);

//        int []A = {1, 1, 5};
//        obj.Q12(A);

//        int []A = {1, 2, 3, 4, 4, 5};
//        obj.Q13(A);

//        int []A = {1, 2, 3, 4};
//        int []B = {3, 4};
//        obj.Q14(A, B);

//        int []A = {8, 9, 4, 5};
//        System.out.println(obj.Q15(A, 3));

//        int []A = {5, 2, 4, 1, 4};
//        obj.Q16(A);

    }
}

