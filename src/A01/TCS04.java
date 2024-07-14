package A01;
import java.util.*;

public class TCS04 {
    public void Q01(int num){
        // sum of 1st and last digit
        System.out.println((num % 10) + (num / 10000));

    }

    public void Q02(String str){
        int vowel = 0, consonant = 0, number = 0, specialCharacter = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'V')){
                if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
            else if(ch >= '0' && ch <= '9'){
                number++;
            }
            else{
                specialCharacter++;
            }
        }
        System.out.print("vowel - " + vowel + ", consonant - " + consonant + ", number - " + number + ", special character - " + specialCharacter);
    }

    public void Q03(String str){
        // Remove vowels from a String
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
                continue;
            }
            else{
                ans = ans + ch;
            }
        }
        System.out.println(ans);
    }

    public void Q04(String str){
        str = str.replaceAll(" ", "");
        System.out.println(str);
    }

    public void Q05(String str01, String str02){
        String ans = "";
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i = 0; i < str01.length(); i++){
            if(h.containsKey(str01.charAt(i))){
                h.put(str01.charAt(i), h.get(str01.charAt(i)) + 1);
            }
            else{
                h.put(str01.charAt(i), 1);
            }
        }

        for(int i = 0; i < str02.length(); i++){
            char ch = str02.charAt(i);
            if(h.containsKey(ch)){
                h.remove(ch);
            }
        }
        for(Map.Entry<Character, Integer> map : h.entrySet()){
            ans = ans + map.getKey();
        }
        System.out.println(ans);
    }

    public void Q06(String str){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                ans = ans +str.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public void Q07(String ans){
        String str = "";
        for(int i = 0; i < ans.length(); i++){
            char ch = ans.charAt(i);
            if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){
                str = str + ch;
            }
        }
        int num = Integer.parseInt(str);
        int result = 0;
        while(num > 0){
            result = result + num % 10;
            num /= 10;
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        TCS04 obj = new TCS04();

//        String ans = "ashish12@";
//        obj.Q02(ans);

//        String str = "ashish";
//        obj.Q03(str);

//        String str = "Geeks For Geeks";
//        obj.Q04(str);

//        obj.Q05("computer", "cat");

//        obj.Q06("$Gee*k;s..fo, r’Ge^eks?");

        obj.Q07("1abc23");
    }
}
