package Module5.HW.HomeWork_5_5;


import Module5.HW.HomeWork_5_1.Room;

public class DAOImpl implements DAO {


    @Override
    public Room save(Room room) {
        return room;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }
}
