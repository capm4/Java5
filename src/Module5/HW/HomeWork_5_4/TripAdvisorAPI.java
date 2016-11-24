package Module5.HW.HomeWork_5_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;

import java.util.Date;


public class TripAdvisorAPI implements API{
    Room[] rooms;

    @Override
    public void findRooms(int price, int persons, String city, String hotel){
        rooms[0]= new Room (1,600, 5, new Date(2016, 6, 7), "Universe", "Horlivka");
        rooms[1]= new Room(2,100, 2, new Date(2016, 1, 11), "Roksolana", "lviv");
        rooms[2]= new Room(3,200, 2, new Date(2016, 2, 10), "LOVA", "Ternopil");
        rooms[3]= new Room(4,300, 4, new Date(2016, 4, 9), "Tur", "Khmelnutskiy");
        rooms[4]= new Room(5,250, 1, new Date(2016, 3, 11), "Lux", "lviv");
    }


}
