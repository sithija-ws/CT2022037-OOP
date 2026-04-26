import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double celsius,fahrenheit;

        //get inputs
        System.out.print("Enter temp in celsius: ");
        celsius = myScanner.nextDouble();

        if (Double.isFinite(celsius) || !Double.isNaN(celsius)){
            fahrenheit = (1.8*celsius) + 32;
            System.out.printf("Temp in Fahrenheit: %.2f", fahrenheit);
        } else {
            System.out.println("invalid input!");
        }
    }
}
