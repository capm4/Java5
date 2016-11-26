package Module5.HW.HomeWork_5_3;

import Module5.HW.HomeWork_5_1.Room;

import java.lang.reflect.Array;

public abstract class SeargRoom implements API{

    private Room[] rooms;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel){
        int count = 0;
        for (Room seargRooms : getRooms()) {
            if (seargRooms.getPrice() == price && seargRooms.getPersons() == persons && seargRooms.getCityName() == city && seargRooms.getHotelName()== hotel)
               count++;
        }

        Room[] findRoom = new Room[count];
        int index = 0;
        for (Room seargRoom : getRooms()) {
            if (seargRoom.getPrice() == price && seargRoom.getPersons() == persons && seargRoom.getCityName() == city && seargRoom.getHotelName()==hotel) {
                findRoom[index] = seargRoom;
            }
        }
        return findRoom;
    }
}
