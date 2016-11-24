package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;

import java.util.Date;

public class BookingComAPI implements API {
    Room[] rooms;

    @Override
    public void findRooms(int price, int persons, String city, String hotel) {
        rooms[10] = new Room(11, 1110, 2, new Date(2016, 8, 4), "Moscow", "Moscow");
        rooms[11] = new Room(12, 1100, 1, new Date(2016, 8, 4), "Kiyv", "Kiyv");
        rooms[12] = new Room(13, 100, 1, new Date(2016, 8, 4), "Lviv", "Lviv");
        rooms[13] = new Room(14, 10012, 3, new Date(2016, 8, 4), "NY", "NY");
        rooms[14] = new Room(15, 10, 2, new Date(2016, 8, 4), "LA", "LA");
    }
}
