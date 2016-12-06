package Module6.HW.HomeWork_6_5;

/**
 * Created by user on 30.11.2016.
 */
public class User {
    private int balace;
    private int id;
    private int salary;
    private String firstName;
    private String lastName;


    public User(int balace, int id, int salary, String firstName, String lastName) {
        this.balace = balace;
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        if (salary != user.salary) return false;
        if (!firstName.equals(user.firstName)) return false;
        return lastName.equals(user.lastName);

    }

    @Override
    public int hashCode() {
        int result = balace;
        result = 31 * result + id;
        result = 31 * result + salary;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "balace=" + balace +
                ", id=" + id +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
