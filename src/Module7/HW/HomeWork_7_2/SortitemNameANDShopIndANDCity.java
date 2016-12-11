package Module7.HW.HomeWork_7_2;

import Module7.HW.HomeWork_7_1.Order;

import java.util.Comparator;

/**
 * Created by user on 11.12.2016.
 */
public class SortitemNameANDShopIndANDCity implements Comparator<Order> {
    @Override
    public int compare(Order a, Order b) {
        String s1ItemName = a.getItemName().toUpperCase();
        String s2ItemName = b.getItemName().toUpperCase();
        int itemNameCompare = s1ItemName.compareTo(s2ItemName);

        String s1ShopInd = a.getShopIdentificator().toUpperCase();
        String s2ShopInd = b.getShopIdentificator().toUpperCase();
        int shopInd = s1ShopInd.compareTo(s2ShopInd);

        String s1City = a.getUser().getCity().toUpperCase();
        String s2City = b.getUser().getCity().toUpperCase();
        int cityCompare = s1City.compareTo(s2City);

        if (itemNameCompare == 0 && shopInd == 0 ) {
            return s1City.compareTo(s2City);
        }
        else if (shopInd !=0 && itemNameCompare ==0){
            return s1ShopInd.compareTo(s2ShopInd);
        }
        else if (itemNameCompare != 0 && shopInd == 0 ){
            return s1ItemName.compareTo(s2ItemName);
        }
        else if (itemNameCompare !=0 && shopInd !=0){
            return s1ItemName.compareTo(s2ItemName);
        }
        else {
            return 0;
        }
    }
}
