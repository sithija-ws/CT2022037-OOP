import java.text.SimpleDateFormat;
import java.util.Date;

public class Q4 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        System.out.println(format.format(today));

    }
}
