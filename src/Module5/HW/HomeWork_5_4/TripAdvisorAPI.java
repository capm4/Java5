package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_3.SeargRoom;


public class TripAdvisorAPI extends SeargRoom implements API{
    private Room[] rooms;

    public TripAdvisorAPI() {
        this.rooms[0]= new Room (1,600, "Universe", "Horlivka");
        this.rooms[1]= new Room(2,100, "Roksolana", "lviv");
        this.rooms[2]= new Room(3,200, "LOVA", "Ternopil");
        this.rooms[3]= new Room(4,300,"Tur", "Khmelnutskiy");
        this.rooms[4]= new Room(5,250, "Lux", "lviv");
    }

    @Override
    public Room findRooms(int price, int persons, String city, String hotel) {
        return super.findRooms(price, persons, city, hotel);
    }
}
