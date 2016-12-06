package Module7.HW.HomeWork_7_2;

import Module7.HW.HomeWork_7_1.Currency;
import Module7.HW.HomeWork_7_1.Order;
import Module7.HW.HomeWork_7_1.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Module7.HW.HomeWork_7_1.ArraysUtils.*;

/**
 * Created by user on 04.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        //greats Users
        User Ivan = new User(1, "Ivan", "Ivanov", "NY", 1500);
        User Oleg = new User(2, "Oleg", "Krit", "LA", 2000);
        User Max = new User (3, "Max", "Savion", "NY", 3000);
        User Andriy = new User(4, "Andriy", "Bezlik", "LA", 1500);
        User Violeta = new User(5, "Violeta", "Violet", "London", 200);
        User Oleksiy = new User(6, "Oleksiy", "Matchen", "Rome", 1200);
        User Taras = new User(7, "Taras", "Humenuy", "London", 2000);
        User Petro = new User(8, "Petro", "Petrovsliy", "Rome", 3000);
        User Vita = new User(9, "Vita", "Bogach", "LA", 200);
        User Oksana = new User(10, "Oksana", "Mizera", "London", 1500);

        //greats Orders
        ArrayList<Order> orderList = new ArrayList<Order>();
            orderList.add(new Order(1,100, Currency.USD, "Banan", "111", Ivan));
            orderList.add(new Order(2,200,Currency.UAH, "Apple", "222", Oleg));
            orderList.add(new Order(3,300,Currency.USD, "Bear", "111", Max));
            orderList.add(new Order(4,1500,Currency.USD, "Bread", "333", Andriy));
            orderList.add(new Order(5,200,Currency.EUR, "Bread", "444", Violeta));
            orderList.add(new Order(6,400,Currency.EUR, "Bear", "111", Oleksiy));
            orderList.add(new Order(7,100,Currency.EUR, "Apple", "333", Taras));
            orderList.add(new Order(8,200,Currency.EUR, "Banan", "222", Petro));
            orderList.add(new Order(9,400,Currency.UAH, "Bear", "444", Vita));
            orderList.add(new Order(1,100,Currency.USD, "Banan", "111", Ivan));

        //sort list by Order price in decrease order
        //Collections.sort(orderList,sortPrise);

        //sort list by Order price in increase order AND User city
        //Collections.sort(orderList, sortPriseAndCity);

        //sort list by Order itemName AND ShopIdentificator AND User city
        //Collections.sort(orderList, sortitemNameANDShopIndANDCity);


        //delete duplicates from the list
        //deleteDupl(orderList);


        //delete items where price less than 1500
        //delItemPriz(orderList);

        //separate list for two list - orders in USD and UAH
        //separateUSDandUAH(orderList);

        //separate list for as many lists as many unique cities are in User
        separateCity(orderList);

//        for(Order counter: orderList){
//            System.out.println(counter);
//        }

    }
}
