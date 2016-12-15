package Module8.HM.Home_Work_8_1;

import java.util.List;

/**
 * Created by user on 14.12.2016.
 */
public interface AbstractDAO<T>{
      T save(T t);
      void delete(T t);
      void deleteAll(List T);
      void saveAll(List T);
      List <T> getList();
      void daleteById(long id);
      T get(long id);
}
