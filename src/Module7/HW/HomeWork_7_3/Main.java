package Module7.HW.HomeWork_7_3;

import Module7.HW.HomeWork_7_1.Currency;
import Module7.HW.HomeWork_7_1.Order;
import Module7.HW.HomeWork_7_1.User;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        User Ivan = new User(1, "Ivan", "Ivanov", "NY", 1500);
        User Oleg = new User(2, "Oleg", "Olegov", "NY", 1500);
        User Max = new User(3, "Max", "Savion", "NY", 3000);
        User Andriy = new User(4, "Andriy", "Petrov", "LA", 1500);
        User Violeta = new User(5, "Violeta", "Violet", "London", 200);
        User Oleksiy = new User(6, "Oleksiy", "Matchen", "Rome", 1200);
        User Taras = new User(7, "Taras", "Petrov", "London", 2000);
        User Petro = new User(8, "Petro", "Petrovsliy", "Rome", 3000);
        User Vita = new User(9, "Vita", "Bogach", "LA", 200);
        User Oksana = new User(10, "Oksana", "Mizera", "London", 1500);

        Set<Order> orderList = new TreeSet<Order>();
        orderList.add(new Order(1, 100, Currency.USD, "Banan", "111", Ivan));
        orderList.add(new Order(2, 100, Currency.USD, "Banan", "111", Oleg));
        orderList.add(new Order(3, 300, Currency.UAH, "Bear", "111", Max));
        orderList.add(new Order(4, 1500, Currency.USD, "Bread", "333", Andriy));
        orderList.add(new Order(5, 200, Currency.EUR, "Bread", "444", Violeta));
        orderList.add(new Order(6, 400, Currency.EUR, "Bear", "111", Oleksiy));
        orderList.add(new Order(7, 100, Currency.UAH, "Apple", "333", Taras));
        orderList.add(new Order(8, 200, Currency.EUR, "Banan", "222", Petro));
        orderList.add(new Order(8, 200, Currency.EUR, "Banan", "222", Petro));
        orderList.add(new Order(1, 100, Currency.USD, "Banan", "111", Oksana));

        chekForName(orderList, "Petrov");
        maxPrice(orderList);
        deleteCurrency(orderList, Currency.USD);

    }


    private static void chekForName(Set<Order> a, String i) {
        for (Order elem : a) {
            if (elem.getUser().getLastName() == i) {
                System.out.println("Order number " + elem.getId() + " is " + i);
            } else ;
        }
    }

    private static void maxPrice(Set<Order> a) {
        int index = 0;
        for (Order item : a){
            if (index < item.getPrice()) index = item.getPrice();
        }
//        Order maxPos = new Order(1, 100, Currency.USD, "Banan", "111", new User(1, "Ivan", "Ivanov", "NY", 1500));
//        for (Order elemOfArray : a) {
//            if (maxPos.getPrice() < elemOfArray.getPrice() && 0 <= elemOfArray.getPrice())
//                maxPos.setPrice(elemOfArray.getPrice());
//        }
        System.out.println("Max Positive value of array testAr is " + index);
    }
    private static void deleteCurrency(Set<Order> a, Currency currency) {
        Iterator<Order> ordCur = a.iterator();
        while (ordCur.hasNext()) {
            if (ordCur.next().getCurrency().equals(currency)) {
                ordCur.remove();
            }
        }
    }
}

