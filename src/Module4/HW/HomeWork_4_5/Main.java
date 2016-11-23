package Module4.HW.HomeWork_4_5;


import Module4.HW.HomeWork_4_3.ChinaBank;
import Module4.HW.HomeWork_4_3.EUBank;
import Module4.HW.HomeWork_4_3.USBank;
import Module4.HW.HomeWork_4_4.BankSystemImpl;
import Module4.HW.HomeWork_4_4.User;

import static Module4.HW.HomeWork_4_2.Currency.*;


public class Main {
    public static void main(String[] args) {
        USBank USBank1 = new USBank(1, "Ukraine", USA, 20, 1100,1, 12300);
        USBank USBank2 = new USBank(2, "Ukraine", EUR, 12, 1200,3, 15600);

        EUBank EUBank1 = new EUBank(1, "USD", USA, 1, 200,2, 1600);
        EUBank EUBank2 = new EUBank(4, "France", EUR, 3, 23200,12, 121600);

        ChinaBank ChinaBank1 = new ChinaBank(1, "China", USA, 34, 55200,122, 21600);
        ChinaBank ChinaBank2 = new ChinaBank(4, "China", EUR, 324, 200,22, 2100);

        System.out.println(USBank1.getLimitOfWithdrawal());
        System.out.println(ChinaBank2.getLimitOfFunding());
        System.out.println(EUBank1.getCommission(120));
        User user = new User (1000, 4000);
        BankSystemImpl bS = new BankSystemImpl();
        System.out.println(user.getBalance());
        bS.withdrawOfUser(user, 100);
        System.out.println(user.getBalance());
    }
}
