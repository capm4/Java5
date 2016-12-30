package Shild.Chapter_6;

/**
 * Created by user on 25.12.2016.
 */
public class main {
    public static void main(String[] args) {
        QueueCh6 q1 = new QueueCh6(10);
        char name[] = {'T', 'o', 'm'};
        QueueCh6 q2 = new QueueCh6(name);
        char ch;
        int i;

        for ( i =0; i < 10; i++){
            q1.put((char)('A'+1));
        }
        QueueCh6 q3 = new QueueCh6(q1);
        System.out.println("Contents of q1: ");
        for (i=0; i<10;i++){
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Contents of q2: ");
        for (i=0; i<3;i++){
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Contents of q3: ");
        for (i=0; i<10;i++){
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
