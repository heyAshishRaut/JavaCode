package DSA;

public class D01 {
    public void Q01(int size) {
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        7 8 9 10
        4 5 6
        2 3
        1
        */
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        int start = count - size;
        for (int i = 0; i < size; i++) {
            int k = start;
            for (int j = 0; j <= size - 1 - i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            start = start - (size - 1 - i);
        }
    }

    public void Q02(){
        /*
         ********1********
         *******2*2*******
         ******3*3*3******
         *****4*4*4*4*****
         ****5*5*5*5*5****
        */
        int size = 5; // valid till num = 9, NOT A GENERIC PATTERN
        for(int i = 0; i < size; i++){
            int start_num_index = 8 - i;
            int num = i + 1;
            int num_count = num;
            for(int j = 0; j < 17; j++){
                if(j == start_num_index && num_count > 0){
                    System.out.print(num);
                    start_num_index+=2;
                    num_count--;
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println( );
        }
    }

    public void Q03(int size){
        /*
        1
        121
        12321
        121
        1
        */
        for(int i = 0; i < size; i++){
            int cond = i <= size/2 ? 2*i : 2*(size-i-1);
            for(int j = 0; j <= cond; j++){
                if(j <= cond / 2){
                    System.out.print(j + 1);
                }
                else{
                    System.out.print(cond - j + 1);
                }
            }
            System.out.println( );
        }
    }

    public void Q04(int size){
        /*
        Floyd's Triangle
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
        int start = 1;
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(start + " ");
                start++;
            }
            System.out.println( );

        }
    }

    public void Q05(int size){
        /*
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        */
        int [][]A = new int[size][size];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    A[i][j] = 1;
                }
                else if(i == j){
                    A[i][j] = 1;
                }
                else{
                    A[i][j] = A[i - 1][j] + A[i - 1][j - 1];
                }
            }
        }

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println( );
        }
    }

    public void Q06(int size){
        for(int i = 1; i <= size; i++){
            int c = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(c + " ");
                c = c * (i - j) / j;
            }
            System.out.println( );
        }
    }

    public void Q07(int size){
        /*

         *                 *
         * *             * *
         * * *         * * *
         * * * *     * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * *     * * * *
         * * *         * * *
         * *             * *
         *                 *

         */
        for(int i = 1; i <= size / 2; i++){
            for(int j = 1; j <= size; j++){
                if(i >= j || (i + j >= size + 1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
        for(int i = size / 2 + 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                if(i + j <= size + 1 || (i <= j)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }

    public static void main(String[] args) {
        D01 obj = new D01();

//        obj.Q01(4);
//        obj.Q02();
//        obj.Q03(5);
//        obj.Q04(5);
//        obj.Q05(5);
//        obj.Q06(5);
        obj.Q07(10);
    }
}
