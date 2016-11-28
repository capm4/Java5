package Module5.HW.HomeWork_5_5;


import Module5.HW.HomeWork_5_1.Room;

public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(int id, Room room);
    long findById(long id);
    Room[] getAll();
}
