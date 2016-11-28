package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_3.SeargRoom;

import java.util.Arrays;
import java.util.Date;


public class TripAdvisorAPI extends SeargRoom implements API{
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        this.rooms[0]= new Room (1,300,22,new Date(),"Tur", "Khmelnutskiy");
        this.rooms[1]= new Room(2,250,22,new Date(), "Lux", "lviv");
        this.rooms[2]= new Room(3,200,23,new Date(), "LOVA", "Ternopil");
        this.rooms[3]= new Room(4,300,22,new Date(),"Tur", "Khmelnutskiy");
        this.rooms[4]= new Room(5,250,21,new Date(), "Lux", "lviv");
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }
}
