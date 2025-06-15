import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What item would you like to Buy:");
        String product = sc.nextLine();
        System.out.println("What is the price of the each item?");
        double price = sc.nextDouble();
        System.out.println("How many items would you like to buy?");
        int quantity = sc.nextInt();
        double totalPrice = price * (double)quantity;
        System.out.println("You have bought " + quantity + " " + product);
        System.out.println("Your total price is " + totalPrice);
    }
}
