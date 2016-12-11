package Module7.HW.HomeWork_7_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 11.12.2016.
 */
public class Main{
    public static void main(String[] args) {
        TimeForInteger time = new TimeForInteger();
        ArrayList<Integer> IntegetList = new ArrayList<>();
        LinkedList<Integer> IntegetLinked = new LinkedList<>();
        ArrayList<String> StringList = new ArrayList<>();
        LinkedList<String> StringLinked = new LinkedList<>();

        time.timeForIntegetAddArraList(IntegetList, 1000);
        time.timeForIntegetAddLinkedList(IntegetLinked, 1000);
        System.out.print("\n");
        time.timeForIntegetAddArraList(IntegetList, 10000);
        time.timeForIntegetAddLinkedList(IntegetLinked, 10000);
        System.out.print("\n");
        time.timeForIntSetList(IntegetList, 100);
        time.timeForIntSetLink(IntegetLinked, 100);
        System.out.print("\n");
        time.timeForIntGetList(IntegetList);
        time.timeForIntGetLink(IntegetLinked);
        System.out.print("\n");
        time.timeForIntRemList(IntegetList, 100);
        time.timeForIntRemLink(IntegetLinked, 100);
        System.out.print("\n");
        time.timeForStrAddList(StringList,1000);
        time.timeForStrAddLinked(StringLinked,1000);

    }


}
