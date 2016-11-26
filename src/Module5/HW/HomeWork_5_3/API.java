package Module5.HW.HomeWork_5_3;


import Module5.HW.HomeWork_5_1.Room;

public interface API {
    Room[] getRooms();
    Room[] findRooms(int price, int persons, String city, String hotel);
}
