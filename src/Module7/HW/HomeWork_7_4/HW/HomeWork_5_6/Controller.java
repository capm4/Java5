package Module7.HW.HomeWork_7_4.HW.HomeWork_5_6;


import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;
import Module5.HW.HomeWork_5_5.DAO;
import Module5.HW.HomeWork_5_5.DAOImpl;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    private API[] apis = {new TripAdvisorAPI(),new GoogleAPI(),new BookingComAPI()};


    DAO dao = new DAOImpl();

    public DAO getDao() {
        return dao;
    }

    public Controller() {
    }

public List<Room> requstRooms(int price, int persons, String hotel, String city) {
    List<Room> requstRooms = new ArrayList<>();
    for (API apisArray : apis) {
            for(Room seargRoom : apisArray.findRooms(price,persons,city,hotel))
                requstRooms.add(seargRoom);
        }
    return requstRooms;
}


public List<Room> check(API api1, API api2){
    int index = 0;
    List<Room> checkRooms = new ArrayList<>();
    for (Room seargRoom : api1.getRooms()){
        if (seargRoom.equals(api2.getRooms())){
            checkRooms.add(seargRoom);
            index++;
        }
    }
    return checkRooms;
}

    public API[] getApis() {
        return apis;
    }
}
