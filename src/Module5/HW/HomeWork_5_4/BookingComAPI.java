package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_3.SeargRoom;

public class BookingComAPI extends SeargRoom implements API {
    private Room[] rooms;

    public BookingComAPI() {
        rooms[10] = new Room(11, 1110,"Moscow", "Moscow");
        rooms[11] = new Room(12, 1100, "Kiyv", "Kiyv");
        rooms[12] = new Room(13, 100, "Lviv", "Lviv");
        rooms[13] = new Room(14, 10012, "NY", "NY");
        rooms[14] = new Room(15, 10, "LA", "LA");
    }

    @Override
    public Room findRooms(int price, int persons, String city, String hotel) {
        return super.findRooms(price, persons, city, hotel);
    }
}
