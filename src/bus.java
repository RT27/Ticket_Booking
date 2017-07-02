import javax.swing.*;

/**
 * Created by xgrape on 6/23/17.
 */
public class bus extends trans {


    public static int seats=52;

    public static String[] SeatsLeft = new String[51];

    public static int BusID;

    public static boolean empty;




    public void ReserveSeat(int SeatNumber, String Name){



            if (SeatsLeft[SeatNumber]==null)
                SeatsLeft[SeatNumber]=Name;
            else
                JOptionPane.showMessageDialog(null,"Seat already Reserved!","Alert Message",JOptionPane.ERROR_MESSAGE);





    }


    public boolean isEmpty(){

        empty=true;

        for(int i=0;i<51 ;i++){

            if(SeatsLeft[i]!=null)
                empty=false;









        }
        return empty;
    }


    public void setBusID(int BusID){
        bus.BusID=BusID;

    }


}
