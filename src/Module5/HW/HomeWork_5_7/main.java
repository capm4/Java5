package Module5.HW.HomeWork_5_7;


import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;
import Module5.HW.HomeWork_5_6.Controller;

public class main {
   public static void main(String[] args) {
       Controller controller = new Controller();

       //System.out.println(room.getHotelName());
       for(Room room : controller.requstRooms(250,21, "Lux", "lviv")){
          // System.out.println(room.getPersons());
           System.out.println("doog");
       }
   }
}
