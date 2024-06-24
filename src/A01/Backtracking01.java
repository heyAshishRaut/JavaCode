package A01;

public class Backtracking01 {
    public void changeArray(int []A, int index, int value){
        if(index == A.length){
            printArray(A);
            return;
        }
        A[index] = value;
        changeArray(A, index + 1, value + 1);
        A[index] = A[index] - 2;
    }

    public void printArray(int []A){
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + "  ");
        }
    }

    public void findSubsets(String str, int index, String ans){
        if(index == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        findSubsets(str, index + 1, ans + str.charAt(index));
        findSubsets(str, index + 1, ans);
    }

    public void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + current);
        }
    }

    static int count = 0;

    public void printBoard(char [][]board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + "  ");
            }
            System.out.println( );
        }
    }

    public void nQueens(char [][]board, int row){
        if(row == board.length){
            System.out.println("----------");
            printBoard(board);
            count++;
            return;
        }

        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    public boolean isSafe(char [][]board, int row, int col){
//        vertical up
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

//        diagonal left up
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

//        diagonal right up
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public int gridWays(int i, int j, int n, int m){
        if(i == n - 1 && j == m - 1){
            return 1;
        }
        else if(i == n && j == m){
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }

    public static void main(String[] args) {
        Backtracking01 obj = new Backtracking01();

        int[] A = {1, 2, 3, 4, 5};
//        obj.changeArray(A, 0, 1);
//        System.out.println( );
//        obj.printArray(A);

        String str = "abc";
        String ans = "";
//        obj.findSubsets(str, 0, ans);

//        obj.findPermutation(str, ans);

        int num = 2;
        char[][] board = new char[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                board[i][j] = '.';
            }
        }

        obj.nQueens(board, 0);
//        System.out.println("Total number of ways - " + count);

//        int n = 3, m = 3;
//        System.out.println(obj.gridWays(0, 0, n, m));
    }
}

