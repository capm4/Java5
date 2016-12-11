package Module7.HW.HomeWork_7_4.HW.HomeWork_5_7;


import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;
import Module5.HW.HomeWork_5_6.Controller;

import java.util.Date;

public class main {
   public static void main(String[] args) {
       Controller controller = new Controller();
       Room roomForTest = new Room(1,300,22,new Date(),"Tur", "Khmelnutskiy");
       controller.requstRooms(250,21, "Lux", "lviv");
       controller.getDao().save(roomForTest);
       controller.getDao().delete(roomForTest);

       }
   }

