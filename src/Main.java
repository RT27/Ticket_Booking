import javax.swing.*;
import java.lang.*;
import java.text.*;
import java.util.*;

/**
 * Created by xgrape on 6/23/17 at 4:41 AM
 * Author : Ronald Tudu
 * Email: xgrape@outlook.com
 * Project Name: Ticket_Booking
 */
public class Main extends Gui1 {
    public static void main(String[] args) {

       trans t= new trans();
        JFrame frame  = new JFrame("Gui1");
        frame.setContentPane(new Gui1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);








    }
}
