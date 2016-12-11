package Module7.HW.HomeWork_7_4.HW.HomeWork_5_4;

import Module7.HW.HomeWork_7_4.HW.HomeWork_5_1.Room;
import Module7.HW.HomeWork_7_4.HW.HomeWork_5_3.API;
import Module7.HW.HomeWork_7_4.HW.HomeWork_5_3.SeargRoom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TripAdvisorAPI extends SeargRoom implements API{
    List<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        this.rooms.add(new Room (1,300,22,new Date(),"Tur", "Khmelnutskiy"));
        this.rooms.add(new Room (2,250,22,new Date(), "Lux", "lviv"));
        this.rooms.add(new Room (3,200,23,new Date(), "LOVA", "Ternopil"));
        this.rooms.add(new Room (4,300,22,new Date(),"Tur", "Khmelnutskiy"));
        this.rooms.add(new Room (5,250,21,new Date(), "Lux", "lviv"));
    }

    @Override
    public List<Room> getRooms() {
        return rooms;
    }
}
