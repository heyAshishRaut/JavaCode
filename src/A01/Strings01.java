package A01;

public class Strings01 {
    public static void main(String[] args) {
//        01

        String s01 = "ASH"; // created in String Constant Pool
        String s02 = new String("ASH"); // created in Heap Area

        String s03 = "ASH";
        String s04 = new String("ASH");

//        Duplicates are allowed in HeapArea
//        Duplicates are not allowed in SCP

        System.out.println(s01 == s02); // check references
//        Output - false
        System.out.println(s01.equals(s02)); // check content
//        Output - true
        System.out.println(s01 == s03); // in SCP
//        Output - true
        System.out.println(s02 == s04); // in HeapArea
//        Output - false

//        02

        String s05 = "ASH" + "ISH";
        System.out.println(s05);
//        ASHISH

        String s06 = "ASH";
        s06 = s06 + "ISH";
        System.out.println(s06);
//        ASHISH

        String s07 = "ASH";
        s07.concat("ISH");
        System.out.println(s07);
//        ASH
//        String s07 is pointing to ASH .... to see changes --> s07 = s07.concat("ISH")

        s07 = s07.concat("ISH");
        System.out.println(s07);
//        ASHISH

        String s08 = "ASH";
        String s09 = "ISH";
        s08 = s08.concat(s09);
        System.out.println(s08);
//        ASHISH

        String s10 = "99";
        String s11 = "11";
        String s12 = "ASHISH";
        String s13 = s10 + s11 + s12;
        System.out.println(s13);
//        9911ASHISH

        String s14 = 100 + 99 + "ASHISH";
        System.out.println(s14);
//        199ASHISH

//        StringBuffer --> thread safe
//        StringBuilder --> not thread safe
        StringBuffer s15 = new StringBuffer("ASHISH");
        System.out.println(s15);
//        ASHISH

//        StringBuffer s16 = "ASHISH"; *INVALID*

        StringBuffer s17 = new StringBuffer("ASH");
        s17.append("ISH");
        System.out.println(s17);
//        ASHISH
        s17 = new StringBuffer("FUSION");
        System.out.println(s17);
//        FUSION

    }
}

