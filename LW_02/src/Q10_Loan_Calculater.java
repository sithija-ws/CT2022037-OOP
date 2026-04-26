import java.util.Scanner;

public class Q10_Loan_Calculater {
    public static void main(String[] args) {
        double loanAmount, annualInterestRate, loanPeriod;
        Scanner myScanner = new Scanner(System.in);

        //get inputs
        System.out.print("Loan amount(dollars) :");
        loanAmount = myScanner.nextDouble();
        System.out.print("Anual interest rate: ");
        annualInterestRate = myScanner.nextDouble();
        System.out.print("Loan period: ");
        loanPeriod = myScanner.nextDouble();

        //compute
        double monthlyInterestRate = annualInterestRate / 100.0 / 12.0;
        double numberOfPayments = loanPeriod * 12.0;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        //display
        System.out.printf("Paments:\n\tMonthly payment: \t%.2f$\n\tTotal payment: \t\t%.2f$", monthlyPayment, totalPayment);
    }
}
