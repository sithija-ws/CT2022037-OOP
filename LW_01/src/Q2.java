import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String fname, lname;

        //get inputs
        System.out.print("First name: ");
        fname = myScanner.nextLine();
        System.out.print("last name: ");
        lname = myScanner.nextLine();

        JFrame myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setTitle(fname + " " + lname);
        myWindow.setVisible(true);
    }
}
