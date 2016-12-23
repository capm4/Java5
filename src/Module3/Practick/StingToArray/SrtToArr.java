package Module3.Practick.StingToArray;


import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class SrtToArr {
    public static void main(String[] args) {
        AnagramsShort("madam", "jamam1");

    }
    public static void Anagrams (String p1 , String p2){
        char [] array1 = p1.toCharArray();
        char [] array2 = p2.toCharArray();
        StringBuilder StArr1 = new StringBuilder();
        StringBuilder StArr2 = new StringBuilder();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i<=array1.length-1; i++)StArr1.append(array1[i]);
        for (int i = 0; i<=array2.length-1; i++)StArr2.append(array1[i]);
        if (StArr1.toString().equals(StArr2.toString())) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }

    public static void AnagramsShort (String p1 , String p2){
        String  ret = "Not Anagrams";
        char [] array1 = p1.toLowerCase().toCharArray();
        char [] array2 = p2.toLowerCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if (Arrays.equals(array1, array2)) ret = "Anagrams";
        System.out.println(ret);
    }



    public static void palindrome(String p1){
        char [] myCharArray = p1.toCharArray ();
        StringBuilder ArrRev = new StringBuilder();
        for (int i = myCharArray.length-1; i>=0; i--)ArrRev.append(myCharArray[i]);
        System.out.println(ArrRev.toString().equals(p1));
        System.out.println(ArrRev.toString());
    }
}
