package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_3.SeargRoom;

import java.util.Date;

public class BookingComAPI extends SeargRoom implements API {
    Room[] rooms = new Room[5];

    public BookingComAPI() {
        this.rooms[0] = new Room(11, 1110,2,new Date(), "Moscow", "Moscow");
        this.rooms[1] = new Room(12, 1100,3,new Date(), "Kiyv", "Kiyv");
        this.rooms[2] = new Room(13, 100,4,new Date(), "Lviv", "Lviv");
        this.rooms[3] = new Room(14, 10012,1,new Date(), "NY", "NY");
        this.rooms[4] = new Room(15, 10,12,new Date(), "LA", "LA");
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}
