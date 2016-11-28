package Module5.HW.HomeWork_5_7;


import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_5.DAO;
import Module5.HW.HomeWork_5_5.DAOImpl;
import Module5.HW.HomeWork_5_6.Controller;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Room roomToTest = new Room(1, 333, 22, new Date(), "Tur", "Khmelnutskiy");
        controller.getDao().getAll();
        controller.getDao().save(roomToTest);
        controller.requstRooms(300,22,"Tur", "Khmelnutskiy");
    }
}
