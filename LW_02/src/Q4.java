import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double weight=0, calories;
        String green = "\u001b[32m";

        //get input
        System.out.print("Weight in pounds(lbs) : ");
        String input_value = myScanner.nextLine();

        //check is input a number
        try{
            weight = Double.parseDouble(input_value);

            if(weight<=0){
                System.out.println("Invalid input! (weight cannot be less than 1 ⛔)");
                System.exit(0);
            }

        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
            System.exit(0);
        }

        calories = weight * 19;
        System.out.printf("Calories need per day:%s %.2f",green, calories);
    }

}
