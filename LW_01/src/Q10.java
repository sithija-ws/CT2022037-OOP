import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String text;

        //get input
        System.out.print("Input your odd length text: ");
        text = myScanner.nextLine();

        if (text.length()%2 == 1) {
            int midInit = (text.length()-1) / 2;
            System.out.println(text.charAt(midInit));
        } else {
            System.out.println("Your text length is not an odd number!");
        }
    }
}
