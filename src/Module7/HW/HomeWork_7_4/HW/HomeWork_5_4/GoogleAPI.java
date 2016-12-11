package Module7.HW.HomeWork_7_4.HW.HomeWork_5_4;

import Module7.HW.HomeWork_7_4.HW.HomeWork_5_1.Room;
import Module7.HW.HomeWork_7_4.HW.HomeWork_5_3.API;
import Module7.HW.HomeWork_7_4.HW.HomeWork_5_3.SeargRoom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI extends SeargRoom implements API {

    List<Room> rooms = new ArrayList<>();

    public GoogleAPI() {
        this.rooms.add(new Room(6, 1200,1,new Date(), "Luk", "London"));
        this.rooms.add(new Room(7, 900,10,new Date(),  "Mazep", "NY"));
        this.rooms.add(new Room(8,300,22,new Date(),"Tur", "Khmelnutskiy"));
        this.rooms.add(new Room(9, 100,13,new Date(), "Marine", "Parish"));
        this.rooms.add(new Room(10, 1000,11,new Date(), "Rock", "Kiyv"));
    }

    @Override
    public List<Room> getRooms() {
        return rooms;
    }
}
