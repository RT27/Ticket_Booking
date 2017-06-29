import javafx.scene.control.Alert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;



/**
 * Created by xgrape on 6/23/17.
 */
public class Gui1 extends trans{
    public JPanel panel1;
    private JButton Searchbutton;
    private JTextField textField1;
    private JComboBox comboBoxOrigin;
    private JComboBox comboBoxDestinatiom;
    private JButton Search;

    public Gui1() {
        Searchbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=textField1.getText();
                ChecknSendDate(x);
                trans t = new trans ();



            }
        });
    }


    public  Calendar ChecknSendDate(String x){


         try {
             SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
             Date date = new Date();
             date = sdf.parse(x);
             if (!x.equals(sdf.format(date))) {
                 JOptionPane.showMessageDialog(null, "pls enter date in format dd.mm.yyyy", "Alert Message", JOptionPane.INFORMATION_MESSAGE);

             } else {
                 JOptionPane.showMessageDialog(null, "match found", "Searching", JOptionPane.INFORMATION_MESSAGE);




             }
         } catch (ParseException ex) {
             ex.printStackTrace();

         }

        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal = Calendar.getInstance();

        return cal;
    }
}
