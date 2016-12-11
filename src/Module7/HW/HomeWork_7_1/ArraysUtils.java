package Module7.HW.HomeWork_7_1;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;

/**
 * Created by user on 04.12.2016.
 */
public class ArraysUtils {
//    public static Comparator<Order> sortPrise = (Order a, Order b) -> {
//        Integer s1 = b.getPrice();
//        Integer s2 = a.getPrice();
//        return s1.compareTo(s2) ;
//    };



//     public static Comparator<Order> sortPriseAndCity = (Order a, Order b) -> {
//        String s1City = a.getUser().getCity().toUpperCase();
//        String s2City = b.getUser().getCity().toUpperCase();
//        Integer s1 = a.getPrice();
//        Integer s2 = b.getPrice();
//
//        Integer count = s1 - s2;
//
//        if (count == 0 ){
//            return s1City.compareTo(s2City);
//        }
//        else if (count != 0){
//            return s2.compareTo(s1);
//        }
//        else return 0;
//     };


    //sort list by Order itemName AND ShopIdentificator AND User city
//    public static Comparator<Order> sortitemNameANDShopIndANDCity = (Order a, Order b) -> {
//        String s1ItemName = a.getItemName().toUpperCase();
//        String s2ItemName = b.getItemName().toUpperCase();
//        int itemNameCompare = s1ItemName.compareTo(s2ItemName);
//
//        String s1ShopInd = a.getShopIdentificator().toUpperCase();
//        String s2ShopInd = b.getShopIdentificator().toUpperCase();
//        int shopInd = s1ShopInd.compareTo(s2ShopInd);
//
//        String s1City = a.getUser().getCity().toUpperCase();
//        String s2City = b.getUser().getCity().toUpperCase();
//        int cityCompare = s1City.compareTo(s2City);
//
//        if (itemNameCompare == 0 && shopInd == 0 ) {
//            return s1City.compareTo(s2City);
//        }
//        else if (shopInd !=0 && itemNameCompare ==0){
//                return s1ShopInd.compareTo(s2ShopInd);
//            }
//        else if (itemNameCompare != 0 && shopInd == 0 ){
//             return s1ItemName.compareTo(s2ItemName);
//        }
//        else if (itemNameCompare !=0 && shopInd !=0){
//            return s1ItemName.compareTo(s2ItemName);
//        }
//       else {
//            return 0;
//        }
//    };

    public static ArrayList<Order> deleteDupl (ArrayList<Order> a)  {
        for(int i = 0;  i < a.size() ; i++)
        {
            for(int j = 0 ; j < a.size() ; j++)
            {
                if (a.get(i).equals(a.get(j)) && i!=j){
                    a.remove(j);
                }
            }
        }
        return a;
    }

    public static ArrayList<Order> delItemPriz (ArrayList<Order> a)  {
        for(int i = 0;  i < a.size() ; i++) {
            Integer prize = a.get(i).getPrice();
            if (prize.equals(1500)) {
                a.remove(i);
            }
        }
       return a;
    }

    public static ArrayList<Order> separateUSDandUAH (ArrayList<Order> a)  {
        ArrayList<Order> orderListUSD = new ArrayList<Order>();
        ArrayList<Order> orderListUAH = new ArrayList<Order>();

        for (int i = 0; i< a.size(); i++){
            Currency value = a.get(i).getCurrency();
            if (value.equals(Currency.USD)){
                orderListUSD.add(a.get(i));
            }
            else if (value.equals(Currency.UAH)){
                orderListUAH.add(a.get(i));
            }
            else continue;
        }
        System.out.println("List of UAH is :");
        for (Order k : orderListUAH){
            System.out.println(k);
        }
        System.out.println("List of USD is :");
        for (Order j : orderListUSD){
            System.out.println(j);
        }

        return a;
    }
    public static ArrayList<Order> separateCity (ArrayList<Order> a)  {
        ArrayList<Order> orderListLA = new ArrayList<Order>();
        ArrayList<Order> orderListLondon = new ArrayList<Order>();
        ArrayList<Order> orderListNY = new ArrayList<Order>();
        ArrayList<Order> orderListRome = new ArrayList<Order>();

        for (int i = 0; i< a.size(); i++){
            String value = a.get(i).getUser().getCity();
            if (value.equals("LA")){
                orderListLA.add(a.get(i));
            }
            else if (value.equals("London")){
                orderListLondon.add(a.get(i));
            }
            else if (value.equals("NY")){
                orderListNY.add(a.get(i));
            }
            else if (value.equals("Rome")){
                orderListRome.add(a.get(i));
            }
            else continue;
        }
        System.out.println("List of LA is :");
        for (Order k : orderListLA){
            System.out.println(k);
        }
        System.out.println("List of London is :");
        for (Order j : orderListLondon){
            System.out.println(j);
        }
        System.out.println("List of NY is :");
        for (Order j : orderListNY){
            System.out.println(j);
        }
        System.out.println("List of Rome is :");
        for (Order j : orderListRome){
            System.out.println(j);
        }
        return a;
    }
    public static TreeSet<Order> removeUSD (TreeSet<Order> a)  {
        for (Order elem : a){
            if (elem.getCurrency().equals(Currency.USD)){
                a.remove(elem);
            }
        }
        return a;
    }

}
