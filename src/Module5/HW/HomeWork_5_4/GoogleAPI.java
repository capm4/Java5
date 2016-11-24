package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;

import java.util.Date;

public class GoogleAPI implements API {

    Room[] rooms;

    @Override
    public void findRooms(int price, int persons, String city, String hotel) {
        rooms[5] = new Room(6, 1200, 2, new Date(2016, 1, 11), "Luk", "London");
        rooms[6] = new Room(7, 900, 3, new Date(2016, 11, 1), "Mazep", "NY");
        rooms[7] = new Room(8, 12001, 22, new Date(2015, 1, 11), "jek", "LA");
        rooms[8] = new Room(9, 100, 1, new Date(2016, 1, 7), "Marine", "Parish");
        rooms[9] = new Room(10, 1000, 10, new Date(2016, 11, 4), "Rock", "Kiyv");
    }
}
