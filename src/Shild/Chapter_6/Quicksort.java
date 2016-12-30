package Shild.Chapter_6;

/**
 * Created by user on 25.12.2016.
 */
public class Quicksort {
    static void qsort (char items []){
        qs (items, 0, items.length-1);
    }
    private static void qs(char items[], int left, int rigth){
        int i,j;
        char x,y;

        i=left;
        j=rigth;
        x = items[(left+rigth)/2];

        do{
            while((items[i]<x)&& (i<rigth)) i++;
            while((x<items[j])&& (j>left))j--;
            if(i<=j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        }
        while (i<=j);
        if(left <j){
             qs(items , left,j);}
        if(i < rigth){
            qs(items,i,rigth);
            }
    }
}
