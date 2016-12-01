package Module6.HW.HomeWork_6_5;

import java.util.Arrays;

/**
 * Created by user on 30.11.2016.
 */
public class UserArray {
    User[] users = new User[5];
    public UserArray(){
        this.users[0] = new User(1000, 1, 100);
        this.users[1] = new User(2000, 2, 200);
        this.users[2] = new User(3000, 3, 300);
        this.users[3] = new User(3000, 3, 300);
        this.users[4] = new User(3000, 3, 300);
    }

    public User[] getUsers() {
        return users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserArray userArray = (UserArray) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(users, userArray.users);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(users);
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserArray{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
