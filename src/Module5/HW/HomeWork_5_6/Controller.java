package Module5.HW.HomeWork_5_6;


import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;
import Module5.HW.HomeWork_5_5.DAOImpl;

public class Controller {
    private API[] apis = new API[3];
    private Room[] findR;
    private Room[] checkR;


    public Controller(API[] apis) {
        this.apis[0] = new TripAdvisorAPI();
        this.apis[1] = new GoogleAPI();
        this.apis[2] = new BookingComAPI();
    }

    public Controller() {
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room fRoom = new Room(price, persons, city, hotel);
        int elemOfArrayOfFindRoom = 0;
        for (int elemOfArray = 0; elemOfArray < apis.length; elemOfArray++) {
            if (apis[elemOfArray].equals(fRoom)) {
                findR[elemOfArrayOfFindRoom] = (Room) apis[elemOfArray];
                elemOfArrayOfFindRoom++;
            }
        }
        return new Room[elemOfArrayOfFindRoom];
    }

    Room[] check(API api1, API api2) {
        return new Room[0];
    }

}
