public class two_d_array {
    public static void main(String[] args){
        String[] fruits = {"Apple","Orange"};
        String[] vegetables = {"Tomato","Onion"};
        String[][] groceries = {fruits,vegetables};

        for(String [] foods : groceries) {
            for(String food : foods){
                System.out.println(food);
            }
        }
    }
}
