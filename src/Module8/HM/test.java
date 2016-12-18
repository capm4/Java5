package Module8.HM;

import Module8.HM.Home_Work_8_4.User;
import Module8.HM.Home_Work_8_4.UserDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.12.2016.
 */
public class test {
    public static void main(String[] args) {
        List<User> user = new ArrayList<>();
        User us1 = new User(1, "sd");
        User us2 = new User(2, "df");
        UserDAO arUser = new UserDAO();
        System.out.println(arUser);
        arUser.save(us1);
        arUser.save(us2);
        System.out.println(arUser);
        arUser.delete(us2);
        System.out.println(arUser);
        arUser.save(us2);
        arUser.save(us2);
        System.out.println(arUser);
        arUser.deleteById(1);
        System.out.println(arUser);
    }
}

