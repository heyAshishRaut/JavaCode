package A01;
import java.util.Scanner;

class Welcome{
    public void welcome(){
        int itemPurchase;
        System.out.println("Welcome to our store");
        System.out.println("Here are the products currently available in our store");
        System.out.print("""
                0. Book01\t100
                1. Book02\t200
                2. Book03\t300
                3. Smartphone01\t5000
                4. Smartphone02\t10000
                5. Smartphone03\t15000
                6. Laptop\t50000
                7. Camera\t60000
                8. Keyboard & Mouse\t2000
                9. Wristwatch\t3500
                """);
    }
}
class Purchase{
    int itemQuantity;
    String feedback;
    public int wantToPurchase(){
        System.out.println("Would you like to purchase - Specify Quantity");
        Scanner s = new Scanner(System.in);
        itemQuantity = s.nextInt();
        int choice;
        int sum = 0;
        if(itemQuantity != 0 && itemQuantity <= 9){

            int []itemPrice = {100, 200, 300, 5000, 10000, 15000, 50000, 60000, 2000, 3500};
            for(int i = 1; i <= itemQuantity; i++){
                System.out.println("Enter product number");
                choice = s.nextInt();
                sum = sum + itemPrice[choice];
            }
        }
        else if(itemQuantity > 9){
            System.out.println("Please, Enter valid number");
            wantToPurchase();
        }
        else{
            System.out.println("Please share you experience to improve our service");
            feedback = s.next();
        }
        return sum;
    }
}
class Billing{
    int totalAmount01;
    int totalAmount02;

    int addMore;
    int finalAmount;
    public void firstPartBilling(){
        Scanner s = new Scanner(System.in);
        Purchase p01 = new Purchase();
        totalAmount01 = p01.wantToPurchase();
        System.out.println("Total amount is - " + totalAmount01);
        if(totalAmount01 != 0){
            System.out.println("Would you like to add more items to cart - 1 for yes & 0 for no");
            addMore = s.nextInt();
            if(addMore == 1){
                Purchase p02 = new Purchase();
                totalAmount02 = p02.wantToPurchase();
                finalAmount = totalAmount01 + totalAmount02;
                System.out.println("Thank You, Have a Great Day");
                System.out.println("Total amount is - " + finalAmount);
            }
            else{
                System.out.println("Thank You, Have a Great Day");
                System.out.println("Total Amount is - " + totalAmount01);
            }
        }
        else{
            System.out.println("Thank You, Have a Great Day");
            System.out.println("Total amount is - " + totalAmount01);
        }
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
        int price;
        Welcome w = new Welcome();
        w.welcome();
        Billing b = new Billing();
        b.firstPartBilling();
    }
}

