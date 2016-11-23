package Module4.HW.HomeWork_4_4;

/**
 * Created by user on 18.11.2016.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double balance = user.getBalance();
        user.setBalance(balance-=amount);
    }

    @Override
    public void fundUser(User user, int amount) {
        double balance = user.getBalance();
        user.setBalance(balance+=amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double balanceFrom = fromUser.getBalance();
        fromUser.setBalance(balanceFrom-=amount);
        double balanceTo = toUser.getBalance();
        toUser.setBalance(balanceTo-=amount);
    }

    @Override
    public void paySalary(User user) {
        double balance = user.getBalance();
        user.setBalance(balance+=user.getSalary());
    }
}
