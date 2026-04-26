import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        double celsius, fahrenheit=0;
        String input,yellow = "\u001b[33m";

        //get input
        System.out.print("Temperature in Fahrenheit: ");
        input = newScanner.nextLine();

        //check is the input valid
        try {
            fahrenheit = Double.parseDouble(input);

        } catch (NumberFormatException e){
            System.out.println("Invalid input!");
            System.exit(0);
        }

        //compute and output result
        celsius = (5.0/9.0) * (fahrenheit-32);
        System.out.printf("Temp (Celsius): %s%.2f", yellow, celsius);
    }
}
