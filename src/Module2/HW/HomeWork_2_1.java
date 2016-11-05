package Module2.HW;

public class HomeWork_2_1 {

    public static void main(String[] args) {
        int[] testAr = {1, 222, -3122, -10, 5098, -2, 127, 10201, 908, -765};
        sum(testAr);
        min(testAr);
        max(testAr);
        maxPositive(testAr);
        multiplication(testAr);
        modulus(testAr);
        secondLargest(testAr);
    }

    public static void sum(int[] array) {
        int sumOfArray = 0;
        for (int elemOfArray : array) sumOfArray +=elemOfArray;
        System.out.println("Sum value of array testAr is " + sumOfArray);
    }

    public static void min(int[] array) {
        int minVal = 0;
        for (int elemOfArray : array) {
            if (minVal > elemOfArray) minVal = elemOfArray;
        }
        System.out.println("Min value of array testAr is " + minVal);
    }

    public static void max(int[] array) {
        int maxVal = 0;
        for (int elemOfArray : array){
            if (maxVal < elemOfArray) maxVal = elemOfArray;
        }
        System.out.println("Max value of array testAr is " + maxVal);
    }

    public static void maxPositive(int[] array) {
        int maxPos = 0;
        for (int elemOfArray : array) {
            if (maxPos < elemOfArray && 0 <= elemOfArray ) maxPos = elemOfArray;
        }
        System.out.println("Max Positive value of array testAr is " + maxPos);
    }

    public static void multiplication (int[] array) {
        int multOfArray = 1, negative = -1;
        for (int elemOfArray : array) multOfArray *=elemOfArray;
        if (multOfArray < 0) multOfArray *=negative;
        System.out.println("Multiplication value of array testAr is " + multOfArray);
    }

    public static void modulus (int[] array) {
        int modOfArray = 0, lastElem = array.length - 1;
        modOfArray = array[0] % array[lastElem];
        System.out.println("modulus of first and last element is " + modOfArray);
    }

    public static void secondLargest (int[] array) {
        int maxVal = 0, secLag = 0;
        for (int elemOfArray : array){
            if (maxVal < elemOfArray) maxVal = elemOfArray;
        }
        for (int elemOfArray : array){
            if (secLag < elemOfArray && maxVal != elemOfArray) secLag = elemOfArray;
        }
        System.out.println("second largest element " + secLag);
    }
}

