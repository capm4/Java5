package Module6.HW.HomeWork_6_5;

/**
 * Created by user on 30.11.2016.
 */
public class User {
    private int balace;
    private int id;
    private int salary;



    public User(int balace, int id, int salary) {
        this.balace = balace;
        this.id = id;
        this.salary = salary;
    }

    public int getBalace() {
        return balace;
    }

    public void setBalace(int balace) {
        this.balace = balace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (balace != user.balace) return false;
        if (id != user.id) return false;
        return salary == user.salary;

    }

    @Override
    public int hashCode() {
        int result = balace;
        result = 31 * result + id;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "balace=" + balace +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
