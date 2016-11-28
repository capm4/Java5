package Module5.HW.HomeWork_5_5;

import Module5.HW.HomeWork_5_1.Room;

import java.util.Arrays;
import java.util.Date;


public class DaoBD {
    private Room[] roomsBD = new Room[10];

    public DaoBD() {
        this.roomsBD[0] = new Room(1, 300, 22, new Date(), "Tur", "Khmelnutskiy");
        this.roomsBD[1] = new Room(2, 250, 22, new Date(), "Lux", "lviv");
        this.roomsBD[2] = new Room(3, 200, 23, new Date(), "LOVA", "Ternopil");
        this.roomsBD[3] = new Room(4, 300, 22, new Date(), "Tur", "Khmelnutskiy");
        this.roomsBD[4] = new Room(5, 250, 21, new Date(), "Lux", "lviv");
        this.roomsBD[5] = new Room(6, 1200, 1, new Date(), "Luk", "London");
        this.roomsBD[6] = new Room(7, 900, 10, new Date(), "Mazep", "NY");
        this.roomsBD[7] = new Room(8, 300, 22, new Date(), "Tur", "Khmelnutskiy");
        this.roomsBD[8] = new Room(9, 100, 13, new Date(), "Marine", "Parish");
        this.roomsBD[9] = new Room(10, 1000, 11, new Date(), "Rock", "Kiyv");
    }


    public Room[] getRoomsBD() {
        return roomsBD;
    }

    public void setRoomsBD(Room[] roomsBD) {
        this.roomsBD = roomsBD;
    }
}
