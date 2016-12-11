package Module7.HW.HomeWork_7_4.HW.HomeWork_5_3;




import Module7.HW.HomeWork_7_4.HW.HomeWork_5_1.Room;

import java.util.List;

public interface API {
    List<Room> getRooms();
    List<Room> findRooms(int price, int persons, String city, String hotel);
}
