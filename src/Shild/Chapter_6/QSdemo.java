package Shild.Chapter_6;

/**
 * Created by user on 25.12.2016.
 */
public class QSdemo {
    public static void main(String[] args) {
        char a[] = {'d','x','a','r','p','j','i'};
        int i;

        System.out.print("Origin array: ");
        for(char elem : a){
            System.out.print(elem);
        }
        System.out.println();
        Quicksort.qsort(a);
        System.out.print("Sorted array: ");
        for (i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
    }
}
