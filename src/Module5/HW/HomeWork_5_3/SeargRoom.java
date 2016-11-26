package Module5.HW.HomeWork_5_3;

import Module5.HW.HomeWork_5_1.Room;

public abstract class SeargRoom {

    private Room[] rooms;
    private Room findRooms;

    public Room findRooms(int price, int persons, String city, String hotel){
        Room newRoom = new Room (price,persons,city,hotel);
        int elemOfArrayOfFindRoom = 0;
        for (int elemOfArray = 0; elemOfArray < rooms.length ; elemOfArray++){
            if (rooms[elemOfArray].equals(newRoom)){
                findRooms = rooms[elemOfArray];
            }
        }
        return findRooms;
    }
}
