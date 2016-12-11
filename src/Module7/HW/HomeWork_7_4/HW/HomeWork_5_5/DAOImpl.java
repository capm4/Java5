package Module7.HW.HomeWork_7_4.HW.HomeWork_5_5;






import Module7.HW.HomeWork_7_4.HW.HomeWork_5_1.Room;

public class DAOImpl implements DAO {
    DaoBD DaoBDarr = new DaoBD();



    @Override
    public Room save(Room room) {
        DaoBDarr.getRoomsBD().add(room);
        return room;
    }



    @Override
    public boolean delete(Room room) {
        boolean isUpdate = false;
        for (Room item : DaoBDarr.getRoomsBD() ){
            if (item.equals(room)){
                DaoBDarr.getRoomsBD().remove(item);
                isUpdate = true;
            }
        }
        return isUpdate;
    }

    @Override
    public Room update(int id, Room room) {
        for (Room roomes : DaoBDarr.getRoomsBD() ){
            if (id == (int) roomes.getId()){
                DaoBDarr.getRoomsBD().add(roomes);
                System.out.println("update");
            }
        }
        return room;
    }


    @Override
    public long findById(long id) {
        for (Room roomes : DaoBDarr.getRoomsBD() ){
            int index = 0;
            if (id == (long) roomes.getId()){
                id = (long) DaoBDarr.getRoomsBD().get(index).getId();
            }
            index++;
        }
        return id;
    }

    @Override
    public void getAll() {
        for (Room roomF : DaoBDarr.getRoomsBD()) System.out.println(roomF);
    }


}
