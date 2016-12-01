package Module6.HW.HomeWork_6_6;

import Module6.HW.HomeWork_6_1.ArraysUtils;
import Module6.HW.HomeWork_6_5.UserArray;
import Module6.HW.HomeWork_6_5.UserUtils;


public class main {
    public static void main(String[] args) {
        ArraysUtils ArraysUtils1 = new ArraysUtils();

        int[] testAr = {100, 1, -3122, 1, 5098, -2, 127, 10201, 908, -765};
        //ArraysUtils1.reverse(testAr);
       // ArraysUtils1.findEvenElements(testAr);
//        for (int i=0; i < testAr.length; i++){
//            System.out.println(testAr[i]);
//        }

        UserUtils us = new UserUtils();
        UserArray arrUs = new UserArray();
        us.uniqueUsers(arrUs.getUsers());
    }
}
