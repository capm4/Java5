package Module8.HM.Home_Work_8_4;

import Module8.HM.Home_Work_8_3.AbstractDAOImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 15.12.2016.
 */
public class UserDAO extends AbstractDAOImpl {
    List<User> list = getList();

    User save(User us) {
        save(us);
        return us;
    }

    @Override
    public void delete(Object o) {
        super.delete(o);
    }

    @Override
    public void deleteAll(List T) {
        super.deleteAll(T);
    }

    @Override
    public void saveAll(List T) {
        super.saveAll(T);
    }

    @Override
    public List getList() {
        return super.getList();
    }

    @Override
    public void deleteById(long id) {
        list.remove(get(id));
    }

    @Override
    public User get(long id) {
        Iterator<User> it = list.iterator();
        User res = null;
        while (it.hasNext()) {
            if (it.next().getId()== id) {
                res = it.next();
                break;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "user=" +list;
    }
}
