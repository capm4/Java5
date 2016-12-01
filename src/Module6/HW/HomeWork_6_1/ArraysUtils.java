package Module6.HW.HomeWork_6_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 29.11.2016.
 */
public final class ArraysUtils {
    static int elemForfindEvEle = 0;

    int[] testAr = {1, 222, -3122, -10, 5098, -2, 127, 10201, 908, -765};

    public final static void sum(int[] array) {
        int sumOfArray = 0;
        for (int elemOfArray : array) sumOfArray +=elemOfArray;
        System.out.println("Sum value of array testAr is " + sumOfArray);
    }

    public final static void min(int[] array) {
        int minVal = array[0];
        for (int elemOfArray : array) {
            if (minVal > elemOfArray) minVal = elemOfArray;
        }
        System.out.println("Min value of array testAr is " + minVal);
    }

    public final static void max(int[] array) {
        int maxVal = array[0];
        for (int elemOfArray : array){
            if (maxVal < elemOfArray) maxVal = elemOfArray;
        }
        System.out.println("Max value of array testAr is " + maxVal);
    }

    public final static void maxPositive(int[] array) {
        int maxPos = array[0];
        for (int elemOfArray : array) {
            if (maxPos < elemOfArray && 0 <= elemOfArray ) maxPos = elemOfArray;
        }
        System.out.println("Max Positive value of array testAr is " + maxPos);
    }

    public final static void multiplication (int[] array) {
        int multOfArray = 1;
        for (int elemOfArray : array) multOfArray *=elemOfArray;
        System.out.println("Multiplication value of array testAr is " + multOfArray);
    }

    public final static void modulus (int[] array) {
        int lastElem = array.length - 1;
        int modOfArray = array[0] % array[lastElem];
        System.out.println("modulus of first and last element is " + modOfArray);
    }

    public final static void secondLargest (int[] array) {
        Arrays.sort(array);
        System.out.println("second largest element " + array[array.length-2]);
    }

    public final static int[] reverse(int[] array){
        int [] reserv = new int [array.length];
        System.arraycopy(array,0,reserv,0,array.length);
        for (int index = reserv.length-1; index >= 0; index-- ){
            array[reserv.length-index-1] = reserv[index];
        }
        return array;
    }

    public final static int[] findEvenElements(int[] array){
        for (int index = 0; index < array.length-1; index++ ){
            if (array[index]%2 == 0) {
                System.out.println("Elemen of array " + (index+1) + " is even ");
            }

         elemForfindEvEle++;
        }
        return array;
   }

}
