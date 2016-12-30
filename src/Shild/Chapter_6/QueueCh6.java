package Shild.Chapter_6;

/**
 * Created by user on 25.12.2016.
 */
public class QueueCh6 {
    private char q[];

    private int putloc, getloc;

    public  QueueCh6(int size){
        q = new char [size+1];
        putloc = getloc = 0;
    }

    public QueueCh6(QueueCh6 ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char [ob.q.length];

        for (int i = getloc+1; i < putloc; i++){
            q[i] = ob.q[i];
        }
    }
    public QueueCh6 (char a[]){
        putloc =0;
        getloc = 0;
        q = new char[a.length+1];
        for (int i = 0; i < a.length; i++){
            put(a[i]);
        }
    }

    public void put (char ch){
        if (putloc == q.length-1){
            System.out.println("- Queue is full.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    public char get(){
        if (getloc == putloc){
            System.out.println("- Queue is empty.");
            return (char)0;
        }

        getloc++;
        return q[getloc];
    }
}
