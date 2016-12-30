package Shild.Chapter_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 24.12.2016.
 */
public class QDemo<T> {
    private List<T> q;

    private int putloc, getloc;

    public QDemo(int size){
        q = new ArrayList<T>();
        putloc = getloc = 0;
    }

    public void put (T ch){
//        if (putloc == q.size()){
//            System.out.println("- Queue is full.");
//            return;
//        }
        putloc++;
        q.add(ch);
    }

    public T get(){
//        if (getloc == putloc){
//            System.out.println("- Queue is empty.");
//        }

        getloc++;
        return q.get(getloc);
    }
}
