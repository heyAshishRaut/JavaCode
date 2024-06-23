package A01;
import java.util.Scanner;

public class Pattern02 {
    public static void Rect01(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print("*  ");
            }
            System.out.println( );
        }
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
    }
    public static void Rect02(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//        *  *  *  *  *
//        *           *
//        *           *
//        *           *
//        *  *  *  *  *
    }
    public static void Rect03(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }
//        1  2  3  4  5
//        1  2  3  4  5
//        1  2  3  4  5
//        1  2  3  4  5
//        1  2  3  4  5
    }
    public static void Rect04(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print(i + "  ");
            }
            System.out.println( );
        }
//        1  1  1  1  1
//        2  2  2  2  2
//        3  3  3  3  3
//        4  4  4  4  4
//        5  5  5  5  5
    }
    public static void Rect05(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(i == j){
                    System.out.print(i + "  ");
                }
                else{
                    System.out.print(0 + "  ");
                }
            }
            System.out.println( );
        }
//        1  0  0  0  0
//        0  2  0  0  0
//        0  0  3  0  0
//        0  0  0  4  0
//        0  0  0  0  5
    }
    public static void Rect06(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row - i; j++){
                System.out.print(1 + "  ");
            }
            for(int k = row - i + 1; k <= row; k++){
                System.out.print(i + "  ");
            }
            System.out.println( );
        }
//        1  1  1  1  1
//        1  1  1  2  2
//        1  1  3  3  3
//        1  4  4  4  4
//        5  5  5  5  5
    }
    public static void Rect07(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            int temp = i;
            for(int j = row; j > i; j--){
                System.out.print(temp + "  ");
                temp++;
            }
            for(int j = 1; j <= i; j++){
                System.out.print(row + "  ");
            }
            System.out.println( );
        }
//        1  2  3  4  5
//        2  3  4  5  5
//        3  4  5  5  5
//        4  5  5  5  5
//        5  5  5  5  5
    }
    public static void Rect08(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = row; i >= 1; i--){
            int temp = i;
            for(int j = row; j > i; j--){
                System.out.print(temp + "  ");
                temp++;
            }
            for(int j = 1; j <= i; j++){
                System.out.print(row + "  ");
            }
            System.out.println( );
        }
//        5  5  5  5  5
//        4  5  5  5  5
//        3  4  5  5  5
//        2  3  4  5  5
//        1  2  3  4  5
    }
    public static void Rect09(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(i == j || i + j == row + 1 || i == 1 || i == row
                        || j == 1 || j == row){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//        7
//        *  *  *  *  *  *  *
//        *  *           *  *
//        *     *     *     *
//        *        *        *
//        *     *     *     *
//        *  *           *  *
//        *  *  *  *  *  *  *
    }
    public static void Rect10(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(i == j || i + j == row + 1 || i + j == row / 2 + 2 || j - i == row / 2 ||
                        i - j == row / 2 || i + j == row + row / 2 + 1){
                    System.out.print("*  ");
                }
//                else if(i == 1 || i == row || j == 1 || j == row){
//                    System.out.print("*  ");
//                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//      9
//        *           *           *
//           *     *     *     *
//              *           *
//           *     *     *     *
//        *           *           *
//           *     *     *     *
//              *           *
//           *     *     *     *
//        *           *           *
    }
    public  static void Rect11(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(i + j <= row / 2 + 2 || j - i >= row / 2 ||
                        i - j >= row / 2 || i + j >= row + row / 2 + 1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//        *  *  *  *  *  *  *  *  *
//        *  *  *  *     *  *  *  *
//        *  *  *           *  *  *
//        *  *                 *  *
//        *                       *
//        *  *                 *  *
//        *  *  *           *  *  *
//        *  *  *  *     *  *  *  *
//        *  *  *  *  *  *  *  *  *
    }
    public static void RtTri01(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println( );
        }
//        *
//        *  *
//        *  *  *
//        *  *  *  *
//        *  *  *  *  *
    }
    public static void RtTri02(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }
//        1
//        1  2
//        1  2  3
//        1  2  3  4
//        1  2  3  4  5
    }
    public static void RtTri03(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }

        for(int i = row - 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }
//         1
//         1  2
//         1  2  3
//         1  2  3  4
//         1  2  3  4  5
//         1  2  3  4
//         1  2  3
//         1  2
//         1
    }
    public static void RtTri04(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = row; j >= i; j--){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }
//         5  4  3  2  1
//         5  4  3  2
//         5  4  3
//         5  4
//         5
    }
    public static void RtTri05(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = row; i >= 1; i--){
            for(int j = row; j >= i; j--){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }
//         5
//         5  4
//         5  4  3
//         5  4  3  2
//         5  4  3  2  1
    }
    public static void RtTri06(){
//        Floyd's Triangle
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        int k = 1;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k + "  ");
                k++;
            }
            System.out.println( );
        }
//         1
//         2  3
//         4  5  6
//         7  8  9  10
//         11  12  13  14  15
    }
    public static void RtTri07(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = i; j >= 1; j--){
                System.out.print(j + "  ");
            }
            System.out.println( );
        }
//         1
//         2  1
//         3  2  1
//         4  3  2  1
//         5  4  3  2  1
    }
    public static void RtTri08(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            int temp = i;
            for(int j = 1; j <= i; j++){
                System.out.print(temp + "  ");
                temp = temp + row;
            }
            System.out.println( );
        }
//         1
//         2  7
//         3  8  13
//         4  9  14  19
//         5  10  15  20  25
    }
    public static void RtTri09(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                if(j % 2 != 0){
                    System.out.print(1 + "  ");
                }
                else{
                    System.out.print(0 + "  ");
                }
            }
            System.out.println( );
        }
//         1
//         1  0
//         1  0  1
//         1  0  1  0
//         1  0  1  0  1
    }
    public static void RtTri10(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        for(int i = 1; i <= row; i++){
            int temp = i;
            for(int j = 1; j <= i; j++){
                System.out.print(temp + "  ");
                temp = temp + row - 1;
            }
            System.out.println( );
        }
//         1
//         2  6
//         3  7  11
//         4  8  12  16
//         5  9  13  17  21
    }
    public static void RtTri11(){
        //Fibonacci Triangle Pattern
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        for(int i = 1; i <= row; i++){
            int num01 = 0;
            int num02 = 1;
            for(int j = 1; j <= i; j++){
                int sum = num01 + num02;
                System.out.print(sum + "  ");
                num01 = num02;
                num02 = sum;
            }
            System.out.println( );
        }
//         1
//         1  2
//         1  2  3
//         1  2  3  5
//         1  2  3  5  8
    }


    public static void Alphabet01(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(j == 1 || j == column || i == 1 || i == (row / 2) + 1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//        *  *  *  *  *  *
//        *              *
//        *  *  *  *  *  *
//        *              *
//        *              *
//        *              *
    }
    public static void Alphabet02(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == (column / 2) + 1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//        *  *  *
//           *
//           *
//           *
//           *
//        *  *  *
    }
    public static void Alphabet03(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        System.out.println("Enter number of Columns");
        int column = s.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || i == (row / 2) + 1 || j == 1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//        *  *  *
//        *
//        *  *  *
//        *
//        *  *  *
    }
    public static void Alphabet04() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        // Rows == Columns
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if((j == 1 && i > 1) || (j == row && i > 1) || (i == (row / 2) + 1) ||
                        (i == 1 && j > 1 && j < row)){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//           *  *  *  *  *
//        *                 *
//        *                 *
//        *  *  *  *  *  *  *
//        *                 *
//        *                 *
//        *                 *
    }
    public static void Alphabet05(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = s.nextInt();
        // Rows == Columns
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if((j == 1) || (i == 1 && j < row) || (i == row && j < row) ||
                        (j == row && i > 1 && i < row)){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
//        *  *  *  *
//        *           *
//        *           *
//        *           *
//        *  *  *  *
    }


    public static void main(String[] args) {
//        i --> rows, j --> columns


//        Rectangle -
//        Rect01();
//        Rect02();
//        Rect03();
//        Rect04();
//        Rect05();
//        Rect06();
//        Rect07();
//        Rect08();
//        Rect09();
//        Rect10();
//        Rect11();

//        Right Angled Triangle -
        RtTri01();
        RtTri02();
        RtTri03();
        RtTri04();
        RtTri05();
        RtTri06();
        RtTri07();
        RtTri08();
        RtTri09();
        RtTri10();
        RtTri11();


        Alphabet01();
        Alphabet02();
        Alphabet03();
        Alphabet04();
        Alphabet05();

    }
}

