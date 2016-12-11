package Module7.HW.HomeWork_7_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class TimeForInteger {

    public static List<Integer> timeForIntegetAddArraList (ArrayList<Integer> a , long sumOfElem) {
        long timestart = System.currentTimeMillis();
        for (Integer i = 0; i <= sumOfElem; i++) {
            a.add(i);
        }
        long timefinish = System.currentTimeMillis();
        System.out.println("Time " + (timefinish - timestart) + " ArrayList for " + sumOfElem + " elements Integer");
        return a;
    }

    public static List<Integer> timeForIntegetAddLinkedList (LinkedList<Integer> a , long sumOfElem) {
        long timestartLinked=System.currentTimeMillis() ;
        for (Integer i = 0; i <= sumOfElem; i++){
            a.add(i);
        }
        long timefinishLinked=System.currentTimeMillis() ;
        System.out.println("Time " + (timefinishLinked -timestartLinked)+ " LinkedList for "+ sumOfElem + " elements Integer");
        return a;
    }

    public static List<String> timeForStrAddList (ArrayList<String> a,long sumOfElem) {
        String world = "Worf";
        Random rng = new Random();
        long timestart = System.currentTimeMillis();
        for (Integer i = 0; i <= sumOfElem; i++) {
            char[] text = new char[5];
            for (int index = 0; index < 5; index++) {
                text[index] = world.charAt(rng.nextInt(world.length()));
            }
            a.add(new String(text));
        }
        long timefinish = System.currentTimeMillis();
        System.out.println("Time " + (timefinish - timestart) + " ArrayList for " + sumOfElem + " elements String");
        return a;
    }
    public static List<String> timeForStrAddLinked (LinkedList<String> a,long sumOfElem) {
        String world = "Worf";
        Random rng = new Random();
        long timestartLinked=System.currentTimeMillis() ;
        for (Integer i = 0; i <= sumOfElem; i++) {
            char[] text = new char[5];
            for (int index = 0; index < 5; index++) {
                text[index] = world .charAt(rng.nextInt(world .length()));
            }
            a.add(new String(text));
        }
        long timefinishLinked=System.currentTimeMillis();
        System.out.println("Time " + (timefinishLinked -timestartLinked)+ " Linked for "+ sumOfElem + " elements String");
        return a;
    }

    public static List<Integer> timeForIntSetList (ArrayList<Integer> a, Integer sumOfSetElem){
        long timestartlist=System.currentTimeMillis();
        for (int i =0; i <= sumOfSetElem; i++){
            a.add(i);
        }
        long timefinishtlist=System.currentTimeMillis();
        System.out.println("Time " + (timefinishtlist -timestartlist)+ " for set to Array List for "+ sumOfSetElem + " elements Integer");
        return a;
    }

    public static List<Integer> timeForIntSetLink (LinkedList<Integer> a, Integer sumOfSetElem){
        long timestartlist=System.currentTimeMillis();
        for (int i =0; i <= sumOfSetElem; i++){
            a.add(i);
        }
        long timefinishtlist=System.currentTimeMillis();
        System.out.println("Time " + (timefinishtlist -timestartlist)+ " for set to Liked List for "+ sumOfSetElem + " elements Integer");
        return a;
    }

    public static Integer timeForIntGetLink (LinkedList<Integer> a){
        long timestartlist=System.currentTimeMillis();
        Integer get = a.get(100);
        long timefinishtlist=System.currentTimeMillis();
        System.out.println("Time " + (timefinishtlist -timestartlist)+ " for get elem in Liked List");
        return get;
    }

    public static Integer timeForIntGetList (ArrayList<Integer> a){
        long timestartlist=System.currentTimeMillis();
        Integer get = a.get(100);
        long timefinishtlist=System.currentTimeMillis();
        System.out.println("Time " + (timefinishtlist -timestartlist)+ " for get elem in Array List");
        return get;
    }

    public static List<Integer> timeForIntRemList (ArrayList<Integer> a, Integer removElem){
        long timestartlist=System.currentTimeMillis();
        a.remove(removElem);
        long timefinishtlist=System.currentTimeMillis();
        System.out.println("Time " + (timefinishtlist -timestartlist)+ " for get elem in Array List");
        return a;
    }

    public static List<Integer> timeForIntRemLink (LinkedList<Integer> a, Integer removElem){
        long timestartlist=System.currentTimeMillis();
        a.remove(removElem);
        long timefinishtlist=System.currentTimeMillis();
        System.out.println("Time " + (timefinishtlist -timestartlist)+ " for get elem in Linked List");
        return a;
    }
}
