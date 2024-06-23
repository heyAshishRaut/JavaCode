package A01;

import java.util.HashMap;
import java.util.Map;

record RecordOfStudent(String name, String id, String datOfBirth){

}

class Point{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double distance(Point another){
        int anotherX = another.getX();
        int anotherY = another.getY();

        double ans = Math.pow(anotherX - x, 2) + Math.pow(anotherY - y, 2);
        double result = Math.sqrt(ans);
        return result;
    }
}

@FunctionalInterface
interface Animal{
    void walk();
}

public class Basics01 {
    public static void main(String[] args) {
        //        int binary_num = 0b1111;
//        System.out.println(binary_num);
//        // 15
//
//        A01 obj = new A01();
//        if(obj instanceof A01){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//
//        int num = 10;
//        Integer num_object = new Integer(num);
//
//        int again_to_num = num_object.intValue();
//
//        String str = Integer.toString(again_to_num);
//
//        int str_to_num = Integer.parseInt(str);


//        Point first = new Point(3, 1);
//        Point second = new Point(6, 5);
//        System.out.println(first.distance(second));

//        RecordOfStudent obj = new RecordOfStudent("Ashish Raut", "21070272", "03-02-2002");
//        System.out.println(obj);
//
//        RecordOfStudent[name=Ashish Raut, id=21070272, datOfBirth=03-02-2002]


        //        Animal obj = new Animal() {
//            public void walk() {
//                System.out.println("Animal is walking !");
//            }
//        };
//        obj.walk();

        HashMap<Integer, String> city_name = new HashMap<>();
        city_name.put(1, "Mumbai");
        city_name.put(2, "Delhi");
        city_name.put(3, "Hyderabad");
        city_name.put(4, "Bangalore");
        city_name.put(5, "Nagpur");

//        System.out.println(city_name);
//        {1=Mumbai, 2=Delhi, 3=Hyderabad, 4=Bangalore, 5=Nagpur}

//        System.out.println(city_name.get(3));
//        Hyderabad

        for(int key : city_name.keySet()){
            System.out.println(key + " " + city_name.get(key));
        }
//        1 Mumbai
//        2 Delhi
//        3 Hyderabad
//        4 Bangalore
//        5 Nagpur

        for(Map.Entry<Integer, String> e : city_name.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
//        1 Mumbai
//        2 Delhi
//        3 Hyderabad
//        4 Bangalore
//        5 Nagpur
    }
}
