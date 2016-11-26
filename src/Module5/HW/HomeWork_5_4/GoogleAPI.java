package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_3.SeargRoom;

import java.util.Date;

public class GoogleAPI extends SeargRoom implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        this.rooms[0] = new Room(6, 1200,1,new Date(), "Luk", "London");
        this.rooms[1] = new Room(7, 900,10,new Date(),  "Mazep", "NY");
        this.rooms[2] = new Room(8, 12001,12,new Date(), "jek", "LA");
        this.rooms[3] = new Room(9, 100,13,new Date(), "Marine", "Parish");
        this.rooms[4] = new Room(10, 1000,11,new Date(), "Rock", "Kiyv");
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}
