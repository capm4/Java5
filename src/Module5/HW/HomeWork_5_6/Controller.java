package Module5.HW.HomeWork_5_6;


import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;

public class Controller {

    API[] apis = new API[3];

    public Controller(API[] apis) {
        this.apis[0] = new TripAdvisorAPI();
        this.apis[1] = new GoogleAPI();
        this.apis[2] = new BookingComAPI();
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    Room[] check(API api1, API api2) {
        return new Room[0];
    }
}
