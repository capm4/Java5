package Module7.HW.HomeWork_7_4;

import Module5.HW.HomeWork_5_1.Room;
import Module5.HW.HomeWork_5_3.API;
import Module5.HW.HomeWork_5_4.BookingComAPI;
import Module5.HW.HomeWork_5_4.GoogleAPI;
import Module5.HW.HomeWork_5_4.TripAdvisorAPI;
import Module5.HW.HomeWork_5_5.DaoBD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 11.12.2016.
 */
public class ArrayToCollection {
        DaoBD DaoBDarr = new DaoBD();
        BookingComAPI BookRooms = new BookingComAPI();
        GoogleAPI GoogleRooms = new GoogleAPI();
        TripAdvisorAPI TripAdvisorRooms = new TripAdvisorAPI();

        ArrayList<Room> listDAO = (new ArrayList<Room>(Arrays.asList(DaoBDarr.getRoomsBD())));
        ArrayList<Room> listBookingCom = (new ArrayList<Room>(Arrays.asList(BookRooms.getRooms())));
        ArrayList<Room> listGoogleRooms = (new ArrayList<Room>(Arrays.asList(GoogleRooms.getRooms())));
        ArrayList<Room> listTripAdvisorRooms = (new ArrayList<Room>(Arrays.asList(TripAdvisorRooms.getRooms())));
}
