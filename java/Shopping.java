import java.util.Scanner;

public class Shopping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String item ;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy: ");
        item = sc.nextLine();

        System.out.print("What is the price for each: ");
        price = sc.nextDouble();

        System.out.print("What is the quantity of the item : ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\n you have bought "+" "+item+" /s ");
        System.out.println("your total is "+ currency + total);


        sc.close();
    }
}
