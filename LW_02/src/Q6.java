import java.time.LocalDate;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int birthYear=0, age, currentYear;
        String input, green = "\u001b[32m", reset = "\u001b[0m";

        //get input
        System.out.print("Birth year: ");
        input = myScanner.nextLine();

        currentYear = LocalDate.now().getYear();

        //check is input valid
        try{
            birthYear = Integer.parseInt(input);
            if(birthYear<=0 || birthYear>currentYear){
                System.out.println("Invalid input!");
                System.exit(0);
            }

        }catch (NumberFormatException e){
            System.out.println("Invalid input!");
            System.exit(0);
        }

        //compute and output
        age = currentYear - birthYear;
        System.out.printf("You were born in %d and will be (are) %s%d%s this year.", birthYear, green, age, reset);

    }
}
