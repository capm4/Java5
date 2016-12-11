package Module7.HW.HomeWork_7_4.HW.HomeWork_5_3;



import Module7.HW.HomeWork_7_4.HW.HomeWork_5_1.Room;

import java.util.ArrayList;
import java.util.List;

public abstract class SeargRoom implements API {

    private List<Room> rooms;


    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel){
        List<Room> findRoom = new ArrayList<>();
        for (Room seargRooms : getRooms()){
            if (seargRooms.getPrice() == price && seargRooms.getPersons() == persons && seargRooms.getCityName() == city && seargRooms.getHotelName()== hotel){
                findRoom.add(seargRooms);
            }
        }
        return findRoom;
    }
}
