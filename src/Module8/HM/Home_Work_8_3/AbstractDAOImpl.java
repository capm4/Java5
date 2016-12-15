package Module8.HM.Home_Work_8_3;

import Module8.HM.Home_Work_8_1.AbstractDAO;
import Module8.HM.Home_Work_8_4.User;

import java.util.*;

/**
 * Created by user on 15.12.2016.
 */
public abstract class AbstractDAOImpl<T> implements AbstractDAO <T> {
    List<T> list;

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List T) {
        list.removeAll(T);
    }

    @Override
    public void saveAll(List T) {
        list.addAll(T);
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public void daleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }
}
