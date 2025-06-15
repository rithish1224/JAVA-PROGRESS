
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation:");
        char operation = sc.next().charAt(0);
        System.out.println("Enter the first number:");
        double a = (double)sc.nextInt();
        System.out.println("Enter the second number:");
        double b = (double)sc.nextInt();
        double result;
        switch (operation) {
            case '%':
                result = a % b;
                System.out.println(a + " " + operation + " " + b + " is " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + " " + operation + " " + b + " is " + result);
                break;
            case '+':
                result = a + b;
                System.out.println(a + " " + operation + " " + b + " is " + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + " " + operation + " " + b + " is " + result);
            default:
                System.out.println(operation + " is not a valid operation");
                break;
        }}}