package A01;
import java.util.*;

public class Q01 {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        public void display(){
            Node traverse = head;
            while(traverse != null){
                System.out.print(traverse.data + " ");
                traverse = traverse.next;
            }
            System.out.println( );
        }

        public void display(Node head){
            Node traverse = head;
            while(traverse != null){
                System.out.print(traverse.data + " ");
                traverse = traverse.next;
            }
            System.out.println( );
        }

        public int size(){
            Node traverse = head;
            int size = 0;
            while(traverse != null){
                size++;
                traverse = traverse.next;
            }
            return size;
        }

        public void insertAtEnd(int data){
            Node insert = new Node(data);
            if(head == null){
                head = insert;
            }
            else{
                tail.next = insert;
            }
            tail = insert;
        }

        public void splitIntoTwo(){
            Node traverse = head;
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();

            while(traverse != null){
                if(traverse.data % 2 == 0){
                    even.insertAtEnd(traverse.data);
                }
                else{
                    odd.insertAtEnd(traverse.data);
                }
                traverse = traverse.next;
            }

            Node oddPointer = odd.head;
            Node evenPointer = even.head;

            while(oddPointer.next != null){
                oddPointer = oddPointer.next;
            }
            oddPointer.next = evenPointer;
            oddPointer = odd.head;

            display(oddPointer);
        }
    }

    public void decimalToBinary01(int num){
        String string = "";
        while(num > 0){
            int remainder = num % 2;
            string = string + remainder;
            num = num / 2;
        }
        String binaryString = "";
        for(int i = string.length() - 1; i >= 0; i--){
            binaryString = binaryString + string.charAt(i);
        }
        System.out.println(binaryString);
    }

    public void decimalToBinary02(int num){
        ArrayList<Integer> al = new ArrayList<>();
        while(num > 0){
            int remainder = num % 2;
            al.add(remainder);
            num = num / 2;
        }
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
    }

    public void binaryToDecimal01(int bin){
        int power = 0, ans = 0;
        while(bin > 0){
            int remainder = bin % 10;
            ans = ans + (remainder * (int)Math.pow(2, power));
            bin = bin / 10;
            power++;
        }
        System.out.println(ans);
    }

    public int findPower01(int num, int exp){
        if(exp == 1){
            return num;
        }
        else {
            int halfAns = findPower01(num, exp / 2);
            int ans = halfAns * halfAns;
            if (exp % 2 != 0) {
                ans = ans * num;
                return ans;
            }
            return ans;
        }
    }

    public int findPower02(int num, int exp){
        if(exp == 1){
            return num;
        }
        else{
            return num * findPower02(num, exp - 1);
        }
    }

    public void pascalTriangle(int size){
        int [][]A = new int[size][size];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(i >= j){
                    if(j == 0 || i == j){
                        A[i][j] = 1;
                    }
                    else{
                        A[i][j] = A[i - 1][j] + A[i - 1][j - 1];
                    }
                }
            }
        }

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(A[i][j] + "  ");
            }
            System.out.println( );
        }
    }

    public void armstrongNum(int num){
        int size = Integer.toString(num).length();
        int ans = 0, check = num;
        while(num > 0){
            int digit = num % 10;
            int currentAns = 1;
            for(int i = 0; i < size; i++){
                currentAns = currentAns * digit;
            }
            ans = ans + currentAns;
            num = num / 10;
        }
        if(ans == check){
            System.out.println("Yes, It's an Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }

    public void findLCM(int num01, int num02){
        int lcm = Math.max(num01, num02);
        while(true){
            if(lcm % num01 == 0 && lcm % num02 == 0){
                System.out.println("LCM is " + lcm);
                break;
            }
            else{
                lcm++;
            }
        }
    }

    public void highestCommonFactor(int num01, int num02){
        int ans = 0;
        for(int i = 1; i <= num02; i++){
            if(num01 % i == 0 && num02 % i == 0){
                ans = i;
            }
        }
        System.out.println(ans);
    }

    public void pairArray(int []A){
        for(int i = 0; i < A.length - 1; i++){
            for(int j = i + 1; j < A.length; j++){
                System.out.print(A[i] + "," + A[j] + "  ");
            }
            System.out.println( );
        }
    }

    public void printSubArray(int []A){
        for(int i = 0; i < A.length; i++){
            int startIndex = i;
            for(int j = 0; j < A.length; j++){
                int endIndex = j;
                for(int k = startIndex; k <= endIndex; k++){
                    System.out.print(A[k] + " ");
                }
                System.out.print("   ");
            }
            System.out.println( );
        }
    }

    public void maxSubArraySum(int []A){
        int maxSum = 0;
        for(int i = 0; i < A.length; i++){
            int startIndex = i;
            for(int j = 0; j < A.length; j++){
                int endIndex = j;

                int currentSum = 0;
                for(int k = startIndex; k <= endIndex; k++){
                    currentSum = currentSum + A[k];
                }
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public void kadaneAlgorithm(int []A){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < A.length; i++){
            cs = cs + A[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }

    public void waterTrapped(int []A){
        int waterTrap = 0;

        int []leftMax = new int[A.length];
        leftMax[0] = A[0];

        int []rightMax = new int[A.length];
        rightMax[rightMax.length - 1] = A[A.length - 1];

        for(int i = 1; i < leftMax.length; i++){
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
        }

        for(int i = rightMax.length - 1 - 1; i >= 0; i--){
            rightMax[i] = Math.max(A[i], rightMax[i + 1]);
        }

        for(int i = 0; i < A.length; i++){
            int ht = Math.min(leftMax[i], rightMax[i]);
            waterTrap = waterTrap + (ht - A[i]);
        }
        System.out.println(waterTrap);
    }

    public void spiralTraverseIn2DMatrix(int [][]A){
        int startRow = 0, endRow = A.length - 1;
        int startCol = 0, endCol = A.length - 1;

        while(startRow <= endRow && startCol <= endCol){
            // top
            for(int i = startCol; i <= endCol; i++){
                System.out.print(A[startRow][i] + "  ");
            }

            // right
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(A[i][endCol] + "  ");
            }

            // bottom
            for(int i = endCol - 1; i >= startCol; i--){
                System.out.print(A[endRow][i] + "  ");
            }

            // left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                System.out.print(A[i][startCol] + "  ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public void rotateMatrixBy90(int [][]A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if(i <= j){
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
        }

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length / 2; j++){
                int temp = A[i][j];
                A[i][j] = A[i][A.length - 1 - j];
                A[i][A.length - 1 - j] = temp;
            }
        }

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                System.out.print(A[i][j] + "  ");
            }
            System.out.println( );
        }
    }

    public int convertFive(int num) {
        // Your code here
        String ans = Integer.toString(num);
        for(int i = 0; i < ans.length(); i++){
            if(ans.charAt(i) == '0'){
                ans = ans.replace(ans.charAt(i), '5');
            }
        }
        int print = Integer.parseInt(ans);
        return print;
    }

    public void removeConsecutiveCharacter(String S){
        ArrayList<Character> ans = new ArrayList<>();
        for(int i = 0; i < S.length(); i++){
            ans.add(S.charAt(i));
        }
        // a, a, b, a, a
        for(int i = 1; i < ans.size(); i++){
            if(ans.get(i) == ans.get(i - 1)){
                ans.remove(i);
            }
        }
        String print = "";
        for(int i = 0; i < ans.size(); i++){
            print = print + ans.get(i);
        }
        System.out.println(print);

    }

    public void method01(){
        long []A = {7, 8, 3, 4, 2, 9, 5};
        Arrays.sort(A);
        ArrayList<Long> ans = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            ans.add(A[i]);
        }
        int step = 0;
        while(ans.size() > 1){
            if(step % 2 == 0){
                ans.remove(ans.size() - 1);
            }
            else{
                ans.remove(0);

            }
            step++;
        }
        long print = ans.get(0).longValue();
        System.out.println(print);
    }

    public int[] reverse(int []A, int start, int end){
        for(int i = start; i < end / 2; i++){
            int replace = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = replace;
        }
        return A;
    }

    public void reverseGroupOfArray(ArrayList<Integer> A, int N, int K){
        // 1 2 3 4 5
        int []num01 = new int[K];
        int []num02 = new int[N - K];
        for(int i = 0; i < num01.length; i++){
            num01[i] = A.get(i);
        }
        for(int i = 0; i < num02.length; i++){
            num02[i] = A.get(K + i);
        }
        int []num03 = reverse(num01, 0, num01.length);
        int []num04 = reverse(num02, 0, num02.length);

        int []result = new int[num03.length + num04.length];
        for(int i = 0; i < num03.length; i++){
            result[i] = num03[i];
        }
        for(int i = 0; i < num04.length; i++){
            result[num03.length + i] = num04[i];
        }
        System.out.println(Arrays.toString(result));
        // [3, 2, 1, 5, 4]
    }

    public String isSubset( long A1[], long A2[], long N, long M) {
//        HashMap<Long, Integer> hm = new HashMap<>();
//        for(int i = 0; i < N; i++){
//            hm.put(A1[i], 0);
//        }
//        for(int i = 0; i < M; i++){
//            if(!hm.containsKey(A2[i])){
//                return "No";
//            }
//            else{
//                hm.remove(A2[i]);
//            }
//        }
//        return "Yes";

        ArrayList<Long> A = new ArrayList<>();
        for(int i = 0; i < A1.length; i++){
            A.add(A1[i]);
        }
        for(int i = 0; i < A2.length; i++){
            boolean check = false;
            for(int j = 0; j < A.size(); j++){
                if(A2[i] == A.get(j)){
                    check = true;
                    A.remove(j);
                }
            }
            if(check == false){
                return "No";
            }
        }
        return "Yes";
    }

    public void immediateSmaller(int arr[], int n) {
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] < arr[i]){
                System.out.print(arr[i + 1] + "  ");
            }
            else{
                System.out.print(-1 + "  ");
            }
        }
        System.out.print(-1);
    }

    public static void main(String[] args) {
        Q01 obj = new Q01();
        int [][]A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        obj.rotateMatrixBy90(A);
    }
}

