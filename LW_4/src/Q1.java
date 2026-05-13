import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest;

        //get inputs
        System.out.print("First Number: ");
        int Firstnum = input.nextInt();
        System.out.print("Second Number: ");
        int Secondnum = input.nextInt();
        System.out.print("Third Number: ");
        int Thirdnum = input.nextInt();

        //find smallest number
        if(Firstnum>Secondnum && Firstnum>Thirdnum){
            smallest=Firstnum;
        } else if (Secondnum>Thirdnum) {
            smallest=Secondnum;
        } else {
            smallest=Thirdnum;
        }

        //output smallest number
        System.out.printf("Smallest Number: %d\n",smallest);
    }
}