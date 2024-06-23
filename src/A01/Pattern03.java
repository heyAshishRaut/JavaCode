package A01;

public class Pattern03 {
    public static void method01(){
        // row --> 5 and column --> 3
        int row = 5;
        int column = 5;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i > 1 && j == 1 || i > 1 && j == column || i == row / 2 + 1 || i == 1 && j > 1 && j < column){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || i == row / 2 + 1 || j == 1 && i <= row / 2 || j == column && i > row / 2){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 || j == column || i == row / 2 + 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == column / 2 + 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || i == row / 2 + 1 || j == 1 && i <= row / 2 || j == column && i > row / 2){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 || j == column || i == row / 2 + 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("      ");
            // R
            for(int j = 1; j <= column; j++){
                if(j == 1 || i == 1 || i == row / 2 + 1 || j == column && i < row / 2 + 1 || i == row && j == column || i == row - 1 && j == column - 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i > 1 && j == 1 || i > 1 && j == column || i == row / 2 + 1 || i == 1 && j > 1 && j < column){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 && i < row|| j == column && i < row || i == row && j > 1 && j < column){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i == 1 || j == column / 2 + 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }

    public static void method02(){
        int row = 5;
        int column = 5;
        for(int i = 1; i <= row; i ++){
            for(int j = 1; j <= column; j++){
                if(j == 1 || i == 1 || i == row / 2 + 1 || j == column && i < row / 2 + 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 && i < row || j == column && i < row || i == row && j > 1 && j < column && j != column / 2 + 1 || j == column / 2 + 1 && i > row / 2 && i < row){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("      ");

            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || i == row / 2 + 1 || j == 1 && i <= row / 2 || j == column && i > row / 2){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            // K
            for(int j = 1; j <= column; j++){
                if(i == j && j > column / 2 || i + j == row + 1 && j > column / 2 || j == 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == column / 2 + 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 || i == row){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 || i == row){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || i == row / 2 + 1 || j == 1 && i <= row / 2 || j == column && i > row / 2){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }

    public static void method03(){
        int row = 9;
        int column = 9;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == j && i > row / 2 || i + j == row + 1 && i > row / 2 || i == row){
                    System.out.print("X  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
    }

    public static void method04(){
        int row = 14;
        int column = 14;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i + j <= row / 2 + 2  || j == 1 || j == column || i == 1 || i == row){
                    System.out.print("X  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println( );
        }
    }

    public static void method05(){
        int row = 5;
        int column = 5;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i > 1 && j == 1 || i > 1 && j == column || i == row / 2 + 1 || i == 1 && j > 1 && j < column){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 || j == column && i > 1 && i < row|| i == row / 2 + 1 || i == 1 && j < column|| i == row && j < column){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 && i > 1 && i < row || i == 1 && j > 1|| i == row && j > 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 || i == 1 && j < column || i == row && j < column || j == column && i > 1 && i < row){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || i == row / 2 + 1 || j == 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(i == 1|| i == row / 2 + 1 || j == 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 && i > 1 && i < row || i == 1 && j > 1 || i == row && j > 1 ||j == column && i >= row / 2 + 1 || i == row / 2 + 1 && j > column / 2 + 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 1; j <= column; j++){
                if(j == 1 || j == column || i == row / 2 + 1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        method01();
        System.out.println( );
        method02();
        System.out.println( );
        method03();
        System.out.println( );
        method04();
        System.out.println( );
        method05();
    }
}

