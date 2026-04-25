import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("EEEE, MMM dd, yyyy");

        System.out.println(format.format(today));
    }
}
