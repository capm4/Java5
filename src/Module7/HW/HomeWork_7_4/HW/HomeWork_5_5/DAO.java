package Module7.HW.HomeWork_7_4.HW.HomeWork_5_5;


import Module7.HW.HomeWork_7_4.HW.HomeWork_5_1.Room;

public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(int id, Room room);
    long findById(long id);
    void getAll();
}
