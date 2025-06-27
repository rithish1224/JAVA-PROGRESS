import java.util.Scanner;

public class array_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fruits");
        int l = sc.nextInt();
        sc.nextLine();
        String[] fruits = new String[l];
        for(int i=0 ; i<l ; i++){
            System.out.println("Enter the name of fruits");
            fruits[i] = sc.nextLine();
        }
        for(int j = 0 ; j < l ; j++){
            System.out.println(fruits[j]);
        }
    }

    }
