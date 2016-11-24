package Module5.HW.HomeWork_5_6;


import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;

public class Controller {

    API[] apis = new API[3];

    public Controller(API[] apis) {
        this.apis[0] = new TripAdvisorAPI();
        API api1 = this.apis[0];
        this.apis[1] = new GoogleAPI();
        API api2 = this.apis[1];
        this.apis[2] = new BookingComAPI();
        API api3 = this.apis[2];
    }
}
