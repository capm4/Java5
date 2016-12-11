package Module7.HW.HomeWork_7_4.HW.HomeWork_5_5;



import Module7.HW.HomeWork_7_4.HW.HomeWork_5_1.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class DaoBD {
    private List<Room> roomsBD = new ArrayList<>();

    public DaoBD() {
        this.roomsBD.add(new Room(1, 300, 22, new Date(), "Tur", "Khmelnutskiy"));
        this.roomsBD.add(new Room(2, 250, 22, new Date(), "Lux", "lviv"));
        this.roomsBD.add(new Room(3, 200, 23, new Date(), "LOVA", "Ternopil"));
        this.roomsBD.add(new Room(4, 300, 22, new Date(), "Tur", "Khmelnutskiy"));
        this.roomsBD.add(new Room(5, 250, 21, new Date(), "Lux", "lviv"));
        this.roomsBD.add(new Room(6, 1200, 1, new Date(), "Luk", "London"));
        this.roomsBD.add(new Room(7, 900, 10, new Date(), "Mazep", "NY"));
        this.roomsBD.add(new Room(8, 300, 22, new Date(), "Tur", "Khmelnutskiy"));
        this.roomsBD.add(new Room(9, 100, 13, new Date(), "Marine", "Parish"));
        this.roomsBD.add( new Room(10, 1000, 11, new Date(), "Rock", "Kiyv"));
    }


    public List<Room> getRoomsBD() {
        return roomsBD;
    }

    public void setRoomsBD(List<Room> roomsBD) {
        this.roomsBD = roomsBD;
    }
}
