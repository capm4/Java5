package Module5.HW.HomeWork_5_7;


import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;
import Module5.HW.HomeWork_5_6.Controller;

public class main {
   public static void main(String[] args) {
        Controller con = new Controller();
       //System.out.println(con.requstRooms(1,600, "Universe", "Horlivka"));
       System.out.println(con.getQ().getRooms());

    }
}
