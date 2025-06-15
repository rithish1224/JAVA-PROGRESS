
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double width = (double)0.0F;
        double height = (double)0.0F;
        double area = (double)0.0F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width:");
        width = sc.nextDouble();
        System.out.println("Enter Height:");
        height = sc.nextDouble();
        area = width * height;
        System.out.println("DAY.Area is " + area + " cm²");
        sc.close();
    }
}