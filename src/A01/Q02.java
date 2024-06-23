package A01;

import java.util.*;


public class Q02 {
    public static void longestConsecutive(int []A){
//        time complexity - O(n)
//        space complexity - O(n)
        HashSet<Integer> hs = new HashSet<>();
        for(int e : A){
            hs.add(e);
        }
        int maxStreak = 0;
        for(int e : A){
            if(!hs.contains(e - 1)){
                int currentNum = e;
                int currentStreak = 1;
                while(hs.contains(currentNum + 1)){
                    currentStreak++;
                    currentNum++;
                }
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }
        System.out.println(maxStreak);
    }

    public static void maximumNumbersOnTheTable(int []bag){
        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for(int i = 0; i < bag.length; i++){
            int num = bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else{
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        System.out.println(max);
    }

    public static void sqrtOfNum(int a, int b, int c){
        float num01 = b*b - (4*a*c);
        float num02 = (float)Math.sqrt(num01);
        float num03 = - b+ num02;
        float num04 = - b - num02;
        float num05 = num03 / (2 * a);
        float num06 = num04 / (2 * a);

        System.out.println((int)num05 + "  " + (int)num06);
    }

    public static void pattern(){
//        1
//        0  1
//        1  0  1
//        0  1  0  1
//        1  0  1  0  1
        int size = 5;
        for(int i = 1; i <= size; i++){
            for(int j = i; j >= 1; j--){
                if(j % 2 == 0){
                    System.out.print(0 + "  ");
                }
                else{
                    System.out.print(1 + "  ");
                }
            }
            System.out.println( );
        }
    }

    public static void rhombus(){
        int rows = 5;
        int cols = 9;

        int start = cols / 2 + 1;
        int end = cols;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(j >= start && j <= end && start > 0 && end > 0){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            start--;
            end--;
            System.out.println( );
        }
    }

    public static void removeVowels(String str){
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                str = str.replace(str.charAt(i), ' ');
            }
        }
        str = str.replaceAll(" ", "");
        System.out.println("ans - " + str);
    }

    public static void freqOfCharacter(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }

    public static void fascinating(long n) {
        // code here
        long num = n * 2 * 3;
        String str = Long.toString(num);
        System.out.println(str);
        char []A = str.toCharArray();
        Arrays.sort(A);
        long check = 1;
        System.out.println(Arrays.toString(A));
//        for(int i = 0; i < A.length; i++){
//            if(A[i] != check){
//                return false;
//            }
//            else{
//                check++;
//            }
//        }
//        return true;
    }

    public static void scores(long a[], long b[]) {
        // Your code goes here
        int num01 = 0;
        int num02 = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > b[i]){
                num01++;
            }
            else{
                num02++;
            }
        }
        int ca = num01;
        int cb = num02;
        System.out.println(num01 + " " + num02);
    }

    static long temp(){
        String str = "200";
        char []A = str.toCharArray();
        for(int i = 0; i < A.length / 2; i++){
            char t = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = t;
        }
        int index = 0;
        while(A[index] > 0){
            if(A[index] == '0'){
                index++;
            }
            else{
                break;
            }
        }
        String ans = "";
        for(int i = index; i < A.length; i++){
            ans = ans + A[i];
        }
        long result = Long.parseLong(ans);
        return (long)result;
    }

    public void Anagram(String s, String t){
        // str01 --> HEART, str02 --> EARTH
        char []A = s.toCharArray();
        char []B = t.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        if(Arrays.equals(A, B)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }

    public static int diagonalSum(int[][] mat) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j || i + j == mat.length - 1){
                    a.add(mat[i][j]);
                }
            }
        }

        int sum = a.get(0);
        for(int i = 1; i < a.size(); i++){
            sum = sum + a.get(i);
        }
        return sum;
    }
    public static int majorityElement(final List<Integer> A) {
        int []ar = new int[A.size()];
        for(int i = 0; i < A.size(); i++){
            ar[i] = A.get(i);
        }
        int major = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(ar[i] > major){
                major = ar[i];
            }
        }
        return major;
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s01 = "";
        String s02 = "";
        for(int i = 0; i < word1.length; i++){
            s01 = s01 + word1[i];
        }
        for(int i = 0; i < word2.length; i++){
            s02 = s02 + word2[i];
        }
        return s01.equals(s02);
    }
    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        int count;
        while(n > 0){
            count = n % 10;
            product = product * count;
            sum = sum + count;
            n = n / 10;
        }
        System.out.println(product + " " + sum);
        return product - sum;
    }
    public static int countDigits(int num) {
        int originalNum = num;
        int result = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while(num > 0){
            al.add(num % 10);
            num = num / 10;
        }
        for(int i = 0; i < al.size(); i++){
            if(originalNum % al.get(i) == 0){
                result++;
            }
        }
        return result;
    }
    public static int differenceOfSum(int[] nums) {
        int absoluteDiff;
        int sum01 = 0, sum02 = 0;
        int sumIN = 0;
        for(int i = 0; i < nums.length; i++){
            sum01 = sum01 + nums[i];

            if(nums[i] > 9){
                while(nums[i] > 0){
                    int count = nums[i] % 10;
                    sumIN = sumIN + count;
                    nums[i] = nums[i] / 10;
                }
                nums[i] = sumIN;
            }
            sum02 = sum02 + nums[i];
        }
        absoluteDiff = Math.abs(sum01 - sum02);
        return absoluteDiff;
    }
    public static int numberOfMatches(int n) {
        int match = 0;
        while(n > 0){
            if(n % 2 != 0){
                match = match + n / 2;
                n = n / 2;
            }
            else{
                match = match + (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return match;
    }
    public List<String> fizzBuzz(int n) {
        List<String> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i % 2 == 3 && i % 5 == 0){
                a.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                a.add("Fizz");
            }
            else if(i % 5 == 0){
                a.add("Buzz");
            }
            else{
                a.add(String.valueOf(i));
            }
        }
        return a;
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int trial = nums[nums.length - 1];
        int sum01 = 0, sum02 = 0;
        for (int i = 0; i <= trial; i++) {
            sum01 = sum01 + i;
        }
        for (int i = 0; i < nums.length; i++) {
            sum02 = sum02 + nums[i];
        }
        int res = sum01 - sum02;
        return res;
    }
    public static int reverse(int x) {
        boolean check = false;
        int reqNum = x;
        if(x < 0){
            reqNum = -1 * x;
            check = true;
        }
        String trial01 = Integer.toString(x);
        String trial02 = "";
        for(int i = trial01.length() - 1; i >= 0; i--){
            trial02 = trial02 + trial01.charAt(i);
        }
        int result = Integer.parseInt(trial02);
        if(check == true){
            result = -1 * result;
        }
        return result;
    }
    public static int countSeniors(String[] details) {
        int check = 0;
        for(int i = 0; i < details.length; i++){
            String firstD = "";
            firstD = details[details.length - 5] + details[details.length - 4];
            int age = Integer.parseInt(firstD);
            if(age > 60){
                check++;
            }
        }
        return check;
    }

    public static void main(String[] args) {
//        longestConsecutive(new int[]{1, 2, 200, 3, 100, 101, 4, 201, 102, 5});
//        maximumNumbersOnTheTable(new int[]{1, 2, 1, 3, 3, 2});
//        pattern();
//        rhombus();
//        removeVowels("ashish");
//        sqrtOfNum(1, 5, 6);
//        freqOfCharacter("ashish");
//        int size = 5;
//        int [][]mat = new int[size][size];
//        int startRow = 0;
//        int endRow = size - 1;
//        int startCol = 0;
//        int endCol = size - 1;

//        fascinating(192);

        long []A = {4, 2, 7};
        long []B = {5, 6, 3};
//        scores(A, B);
//        temp();

    }
}
