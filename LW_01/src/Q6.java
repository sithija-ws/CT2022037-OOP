import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int W,H;
        String title;

        //get inputs
        System.out.print("Title of the frame: ");
        title = myScanner.nextLine();
        System.out.print("Width of the frame: ");
        W = myScanner.nextInt();
        System.out.print("Height of the frame: ");
        H = myScanner.nextInt();

        JFrame myWindow = new JFrame();
        myWindow.setSize(W,H);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}
