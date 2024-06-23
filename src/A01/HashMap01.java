package A01;

import java.util.*;

public class HashMap01 {
    public static void twoSum(){
        int []A = {2, 7, 11, 15};
        int target = 9;
        int []result = {-1, -1};
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            hs.put(A[i], i);
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] == target && hs.containsKey(0)){
                result[0] = i;
                result[1] = hs.get(0);
                break;
            }
            else if(hs.containsKey(target - A[i])){
                if(hs.get(target - A[i]) > i){
                    result[0] = i;
                    result[1] = hs.get(target - A[i]);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void firstOccurence(){
        String s = "priyapr";
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);
            }
            else{
                hs.put(s.charAt(i), 1);
            }
        }
        int result = -1;
        for(int i = 0; i < s.length(); i++){
            if(hs.get(s.charAt(i)) == 1){
                result = 1;
                System.out.println("non - repeating character present at index - " + i);
                break;
            }
        }
        if(result == -1){
            System.out.println("no non - repeating character is present");
        }
    }

    //    print in sorted order based on key
    public static void printInSortedOrder01(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int size = s.nextInt();
        TreeMap<Integer, String> tm = new TreeMap<>();
        for(int i = 0; i < size; i++){
            System.out.println("Enter key (int)");
            int key = s.nextInt();
            System.out.println("Enter value (String)");
            String value = s.next();
            tm.put(key, value);
        }
        System.out.println(tm);
    }
    //    print in sorted order based on value
    public static void printInSortedOrder02(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int size = s.nextInt();
        TreeMap<String, Integer> tm = new TreeMap<>();
        for(int i = 0; i < size; i++){
            System.out.println("Enter key (String)");
            String key = s.next();
            System.out.println("Enter value (int)");
            int value = s.nextInt();
            tm.put(key, value);
        }
        System.out.println(tm);
    }

    //    Check duplicates is present or not
    public static void checkDuplicate01(){
        int []A = {1, 2, 3};
        int size = A.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < size; i++){
            hs.add(A[i]);
        }
        if(size == hs.size()){
            System.out.println("no duplicates is present");
        }
        else{
            System.out.println("duplicates is present");
        }
    }

    public static void checkDuplicate02(){
        int []A = {1, 2, 3, 2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i]) + 1);
            }
            else{
                hm.put(A[i], 1);
            }
        }
        for(int i = 0; i < hm.size(); i++){
            if(hm.get(A[i]) > 1){
                System.out.println("Duplicates are present");
                return;
            }
        }
        System.out.println("Duplicates are not present");
    }

    //    Find largest element in array
    public static void largeElementInArray(){
        int []A = {3, 1, 2, 8, 6};
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i = 0; i < A.length; i++){
            tm.put(A[i], i);
        }
        System.out.println(tm.lastKey());
    }

    public static void canCreate(){
        String input01 = "aa";
        String input02 = "aab";

        HashMap<Character, Integer> hm01 = new HashMap<>();
        HashMap<Character, Integer> hm02 = new HashMap<>();

        for(int i = 0; i < input01.length(); i++){
            if(hm01.containsKey(input01.charAt(i))){
                hm01.put(input01.charAt(i), hm01.get(input01.charAt(i)) + 1);
            }
            else{
                hm01.put(input01.charAt(i), 1);
            }
        }
        for(int i = 0; i < input02.length(); i++){
            if(hm02.containsKey(input02.charAt(i))){
                hm02.put(input02.charAt(i), hm02.get(input02.charAt(i)) + 1);
            }
            else{
                hm02.put(input02.charAt(i), 1);
            }
        }
        boolean ans = true;

    }

    //    Check whether two strings are anagram of each other or not
    public static void anagram(){
        String input01 = "knee";
        String input02 = "keen";

        TreeMap<Character, Integer> hm01 = new TreeMap<>();
        TreeMap<Character, Integer> hm02 = new TreeMap<>();

        for(int i = 0; i < input01.length(); i++){
            if(hm01.containsKey(input01.charAt(i))){
                hm01.put(input01.charAt(i), hm01.get(input01.charAt(i)) + 1);
            }
            else{
                hm01.put(input01.charAt(i), 1);
            }
        }

        for(int i = 0; i < input02.length(); i++){
            if(hm02.containsKey(input02.charAt(i))){
                hm02.put(input02.charAt(i), hm02.get(input02.charAt(i)) + 1);
            }
            else{
                hm02.put(input02.charAt(i), 1);
            }
        }

        if(hm01.size() != hm02.size()){
            System.out.println("Not an anagram");
            return;
        }
        for(Map.Entry<Character, Integer> e : hm01.entrySet()){
            if(!hm02.containsKey(e.getKey()) || e.getValue() != hm02.get(e.getKey())){
                System.out.println("Not an Anagram");
                return;
            }
        }
        System.out.println("Its an Anagram");
    }

    public static boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            if(hm.containsKey(sCh)) {
                if (hm.get(sCh) != tCh) {
                    return false;
                }
            }
            else if(hm.containsValue(tCh)){
                return false;
            }
            else{
                hm.put(sCh, tCh);
            }
        }
        System.out.println(hm);
        return true;
    }

    public static void main(String[] args) {
//        twoSum();
        firstOccurence();
    }
}
