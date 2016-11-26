package Module5.HW.HomeWork_5_5;


import Module5.HW.HomeWork_5_1.Room;

import java.util.Date;

public class DAOImpl implements DAO {


    @Override
    public Room save(Room room) {
        System.out.println("You have save room " + room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("You have delete " + room);
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("You have update " + room);
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 1110,2,new Date(), "Moscow", "Moscow");
        System.out.println("You have find  :" + id);
        return room;
    }
}
