package Module8.HM.Home_Work_8_4;

import Module8.HM.Home_Work_8_3.AbstractDAOImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 15.12.2016.
 */
public class UserDAO extends AbstractDAOImpl {
    List<User> user = new ArrayList<>();

    User save(User user) {
        return save(user);
    }

    User delete(User user) {
        delete(user);
        return user;
    }
    User deleteAll(User user){
        deleteAll(user);
        return user;
    }
    User saveAll(User user){
        saveAll(user);
        return user;
    }
    public List getList(){
        return getList();
    }
    public void daleteById(long id){
        user.remove(getId(id));
    }
    User  getId(long id){
        Iterator<User> it = user.iterator();
        User res = null;
        while (it.hasNext()) {
            if (it.next().getId()==id) {
                res = (User) it;
                break;
            }
        }
        return res;
    }
}
