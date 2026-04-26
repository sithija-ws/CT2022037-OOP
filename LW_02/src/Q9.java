import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        double P,R,result;
        int N;
        String green = "\u001b[32m", reset = "\u001b[0m";

        //get inputs
        System.out.print("Investment (dollars): ");
        P = newScanner.nextDouble();
        System.out.print("Interest rate: ");
        R = newScanner.nextDouble();
        System.out.print("number of years : ");
        N = newScanner.nextInt();

        //compute result
        result = P * Math.pow((1+R/100.0), N);
        System.out.printf("The amount of money earned: %s%.3f$%s.", green,result, reset);
        newScanner.close();
    }

}
