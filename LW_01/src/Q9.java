import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String text;

        //get input
        System.out.print("Enter your text: ");
        text = myScanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("Invalid input!");
        }else {
            System.out.println(text.length() + "\n" + text.charAt(0) + "\n" + text.charAt(text.length()-1));
        }
    }
}
