import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String fName, mName, lName;

        //get inputs
        System.out.print("First name: ");
        fName = myScanner.nextLine();
        System.out.print("Middle name: ");
        mName = myScanner.nextLine();
        System.out.print("Last name: ");
        lName = myScanner.nextLine();

        String nameToDisplay = fName + " " + mName.charAt(0) + ". " + lName;
        System.out.println(nameToDisplay);
    }
}
