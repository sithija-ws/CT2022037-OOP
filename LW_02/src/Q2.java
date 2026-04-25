import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        double cm,ft,inch;

        //get inputs
        System.out.println("Enter length in cm: ");
        cm = newScanner.nextDouble();

        inch = cm / 2.54;
        ft = (int)(inch / 12);
        inch -= ft*12;

        System.out.printf("%d ft %.2f in", (int)(ft), inch);



    }
}
