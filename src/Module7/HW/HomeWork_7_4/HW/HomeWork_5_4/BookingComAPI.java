package Module7.HW.HomeWork_7_4.HW.HomeWork_5_4;



import Module7.HW.HomeWork_7_4.HW.HomeWork_5_1.Room;
import Module7.HW.HomeWork_7_4.HW.HomeWork_5_3.API;
import Module7.HW.HomeWork_7_4.HW.HomeWork_5_3.SeargRoom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI extends SeargRoom implements API {
    List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        this.rooms.add(new Room(11, 1110,2,new Date(), "Moscow", "Moscow"));
        this.rooms.add(new Room(12, 1100,3,new Date(), "Kiyv", "Kiyv"));
        this.rooms.add(new Room(13, 100,4,new Date(), "Lviv", "Lviv"));
        this.rooms.add(new Room(14, 10012,1,new Date(), "NY", "NY"));
        this.rooms.add(new Room(15, 10,12,new Date(), "LA", "LA"));
    }

    @Override
    public List<Room> getRooms() {
        return rooms;
    }
}
