package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_3.SeargRoom;

public class GoogleAPI extends SeargRoom implements API {

    private Room[] rooms;

    public GoogleAPI() {
        rooms[5] = new Room(6, 1200, "Luk", "London");
        rooms[6] = new Room(7, 900,  "Mazep", "NY");
        rooms[7] = new Room(8, 12001, "jek", "LA");
        rooms[8] = new Room(9, 100, "Marine", "Parish");
        rooms[9] = new Room(10, 1000, "Rock", "Kiyv");
    }

    @Override
    public Room findRooms(int price, int persons, String city, String hotel) {
        return super.findRooms(price, persons, city, hotel);
    }
}
