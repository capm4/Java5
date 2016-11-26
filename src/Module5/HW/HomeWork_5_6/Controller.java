package Module5.HW.HomeWork_5_6;


import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;
import Module5.HW.HomeWork_5_5.DAOImpl;

import java.util.Arrays;

public class Controller {
    private API[] apis = {new TripAdvisorAPI(),new GoogleAPI(),new BookingComAPI()};
    DAOImpl Dao = new DAOImpl();

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (API apisArray : apis) {
            count += apisArray.findRooms(price,persons,city,hotel).length;
        }
        Room[] requsRooms = new Room[count];
        int i = 0;
        for (API apisArray : apis) {
            for(Room seargRoom : apisArray.findRooms(price,persons,city,hotel))
                requsRooms[i] = seargRoom;
            i++;
        }
        return requsRooms;
    }

    Room[] check(API api1, API api2){
        int count = 0;
        for (int i = 0; i < api1.getRooms().length ; i++) {
            for (int j = 0; j < api1.getRooms().length; j++) {
                if(api1.getRooms()[i].equals(api2.getRooms()[j])){
                    count++;
                }
            }
        }
        int index = 0;
        Room[] checkRooms = new Room[count];
        for (Room seargRoom : api1.getRooms()){
            if (seargRoom.equals(api2.getRooms()[index])){
                checkRooms[index] = seargRoom;
                index++;
            }
        }
        return checkRooms;
    }

}
