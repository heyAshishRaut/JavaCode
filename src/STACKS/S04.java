package STACKS;

import java.util.Stack;

public class S04{
    public boolean brackets(String str){
        Stack<Character> st = new Stack<>();
        int size = str.length();
        for(int i = 0; i < size; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek() == '('){
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public int[] removeConsecutiveSubsequences(int []A){
        // 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7
        int size = A.length;
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < A.length; i++){
            if(s.isEmpty() || s.peek() != A[i]){
                s.push(A[i]);
            }
            else if(A[i] == s.peek()){
                if(i == size - 1 || A[i] != A[i + 1]){
                    s.pop();
                }
            }
        }
        int []result = new int[s.size()];
        for(int i = result.length - 1; i >= 0; i--){
            result[i] = s.pop();
        }
        return result;
    }

    public void nextGreaterElement01(){
        int []A = {1, 3, 2, 1, 8, 6, 3, 4};
        int []result = new int[A.length];

        for(int i = 0; i < A.length; i++){
            result[i] = -1;
            for(int j = i + 1; j < A.length; j++){
                if(A[j] > A[i]){
                    result[i] = A[j];
                    break;
                }
            }
        }

        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println( );
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public void stockSpan(int []stocks, int []span){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i = 1; i < stocks.length; i++){
            int currentPrice = stocks[i];
            while(!s.isEmpty() && currentPrice >= stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i + 1;
            }
            else{
                int previousHigh = s.peek();
                span[i] = i - previousHigh;
            }
            s.push(i);
        }
    }

    public void nextGreater02(){
        int []A = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int []nextGreater = new int[A.length];

        for(int i = A.length - 1; i >= 0; i--){
            while(!s.isEmpty() && A[s.peek()] <= A[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = A[s.peek()];
            }
            s.push(i);
        }
        for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
    }

    public static void main(String[] args) {
        S04 obj = new S04();

//        String s = "(()()";
//        System.out.println(obj.brackets(s));

//        int []A = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7};
//        int []ans = obj.removeConsecutiveSubsequences(A);
//        for(int i = 0; i < ans.length; i++){
//            System.out.print(ans[i]  + " ");
//        }

//        obj.nextGreaterElement01();

        int []stocks = {100, 80, 60, 70, 60, 85, 100};
        int []span = new int[stocks.length];
//        obj.stockSpan(stocks, span);
//        System.out.println(Arrays.toString(span));

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // [1, 2, 3]
        System.out.println(s);
    }
}
