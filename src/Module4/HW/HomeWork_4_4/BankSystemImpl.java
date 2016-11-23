package Module4.HW.HomeWork_4_4;

/**
 * Created by user on 18.11.2016.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        user.balance-= amount;
    }

    @Override
    public void fundUser(User user, int amount) {
        user.balance+=amount;
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        fromUser.balance -= amount;
        toUser.balance += amount;
    }

    @Override
    public void paySalary(User user) {
        user.balance+=user.salary;
    }
}
