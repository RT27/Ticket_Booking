import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;



/**
 * Created by xgrape on 6/23/17.
 * Author : Ronald Tudu
 * Email:xgrape@outlook.com
 */
public class Gui1 extends trans{
    public JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBoxOrigin;
    private JComboBox comboBoxDestination;
    private JButton Search;
    private JComboBox ChooseTrans;


    public static trans t1 = new trans();

    public Gui1() {
        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x=textField1.getText();
                try{
                    Date date = new SimpleDateFormat("dd.MM.yyyy").parse(x);
                    System.out.println(date);

                }
                catch (Exception ex){
                    ex.printStackTrace();

                }


               // t1.Search_date=






            }
        });
        comboBoxOrigin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String origin= comboBoxOrigin.getSelectedItem().toString();
                System.out.println(origin);

            }
        });
        comboBoxDestination.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dest= comboBoxDestination.getSelectedItem().toString();
                System.out.println(dest);



            }
        });
    }


    public void ChecknSendDate(String x){


         try {
             SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
             Date date = new Date();
             date = sdf.parse(x);
             if (x.equals(sdf.format(date))) {
                 JOptionPane.showMessageDialog(null, "match found", "Searching", JOptionPane.INFORMATION_MESSAGE);

             } else {


                 JOptionPane.showMessageDialog(null, "pls enter date in format dd.mm.yyyy", "Alert Message", JOptionPane.INFORMATION_MESSAGE);


             }
         } catch (ParseException ex) {
             ex.printStackTrace();
             JOptionPane.showMessageDialog(null, "pls enter date in format dd.mm.yyyy", "Alert Message", JOptionPane.INFORMATION_MESSAGE);

         }




    }
}
