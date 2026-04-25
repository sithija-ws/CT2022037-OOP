import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

        String title = format.format(today);

        JFrame myWindow = new JFrame();
        myWindow.setSize(600,800);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}
