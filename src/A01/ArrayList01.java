package A01;
import java.util.*;

public class ArrayList01 {
    public void M01(){
        ArrayList<String> a = new ArrayList<>();
//        Adding element -
        a.add("Ashish01");
        a.add("Ashish02");
        System.out.println(a);

//        Adding element at specific index
        a.add(1, "InsertAshishAtIndex01");
        System.out.println(a);

//        Set method
        a.set(1, "NewAshishAtIndex01");
        System.out.println(a);

//        Remove - index
        a.remove(1);
        System.out.println(a);

//        Remove - object
        a.remove("Ashish01");
        a.remove("Ashish02");
        System.out.println(a);

        a.add("One");
        a.add("Two");
        a.add("Three");
        a.add("Four");
        a.add("Five");

//        get method
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + "  ");
        }

        for(String s : a){
            System.out.print(s + "  ");
        }

//        Sorting ArrayList
        Collections.sort(a);
    }

    public void printReverseArrayList(){
        ArrayList<Integer> a01 = new ArrayList<>();
        a01.add(1);
        a01.add(2);
        a01.add(3);
        a01.add(4);
        a01.add(5);

        for(int i = a01.size() - 1; i >= 0; i--){
            System.out.print(a01.get(i) + "  ");
        }
    }

    public void findMax(){
        ArrayList<Integer> a01 = new ArrayList<>();
        a01.add(1);
        a01.add(10);
        a01.add(3);
        a01.add(4);
        a01.add(5);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < a01.size(); i++){
            if(a01.get(i) > max){
                max = a01.get(i);
            }
        }
        System.out.println("Maximum number is " + max);
    }

    public void swapTwoNumbers(ArrayList<Integer> a, int num01, int num02){
        int index01 = a.indexOf(num01);
        int index02 = a.indexOf(num02);

        a.set(index01, num02);
        a.set(index02, num01);

        System.out.println(a);
    }

    public void sortArrayList(){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(10);
        a.add(5);
        a.add(9);
        a.add(2);

        Collections.sort(a); // ascending order
        System.out.print(a + "  ");
        System.out.println();

        Collections.sort(a, Collections.reverseOrder()); // descending order
        System.out.print(a + "  ");
    }

    public void multiDimensional(){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);

        mainList.add(list01);

        ArrayList<Integer> list02 = new ArrayList<>();
        list02.add(4);
        list02.add(5);
        list02.add(6);

        mainList.add(list02);

        System.out.println(mainList);

        for(int i = 0; i < mainList.size(); i++){
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j = 0; j < currentList.size(); j++){
                System.out.print(currentList.get(j) + "  ");
            }
            System.out.println( );
        }
    }

    public static void main(String[] args) {
        ArrayList01 obj = new ArrayList01();
//        obj.M01();
//        obj.printReverseArrayList();
//        obj.findMax();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
//        obj.swapTwoNumbers(a, 2, 4);
//        obj.sortArrayList();
        obj.multiDimensional();
    }
}

