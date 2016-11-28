package Module5.HW.HomeWork_5_5;





import Module5.HW.HomeWork_5_1.Room;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DAOImpl implements DAO {
    DaoBD DaoBDarr = new DaoBD();



    @Override
    public Room save(Room room) {
        DaoBDarr.setRoomsBD(Arrays.copyOf(DaoBDarr.getRoomsBD(),DaoBDarr.getRoomsBD().length+1));
        DaoBDarr.getRoomsBD()[DaoBDarr.getRoomsBD().length-1]=room;
    return room;
    }

    @Override
    public boolean delete(Room room) {
        boolean isUpdate = false;
        int index =0;
        for (Room roomes : DaoBDarr.getRoomsBD() ){

            if (roomes.equals(room)){
                DaoBDarr.getRoomsBD()[index] = null;
                isUpdate = true;
                System.out.println("delete");
            }
            index++;
        }
        return isUpdate;
    }

    @Override
    public Room update(int id, Room rooms) {
        int index =0;
        for (Room roomes : DaoBDarr.getRoomsBD() ){
            if (id == (int) roomes.getId()){
                DaoBDarr.getRoomsBD()[index] = rooms;
                System.out.println("update");
            }
            index++;
        }
        return rooms;
    }

    @Override
    public long findById(long id) {
        int index =0;
        for (Room roomes : DaoBDarr.getRoomsBD() ){
            if (id == (long) roomes.getId()){
                id = (long) DaoBDarr.getRoomsBD()[index].getId();
            }
            index++;
        }
        return id;
    }

    @Override
    public Room[] getAll() {
        for (Room roomF : DaoBDarr.getRoomsBD()) System.out.println(roomF);
        return new Room[0];
    }


}
