package Shild.Chapter_4;


public class mainQ {
    public static void main(String[] args) {
        QDemo bigQ = new QDemo(100);
        QDemo smallQ = new QDemo(4);
        String ch;
        int i;

        System.out.println("Using bigQ to store rhe alphabet");

        for (i=0; i<26; i++){
            bigQ.put((char)('A'+i));
        }
        System.out.println("Contents of bogQ: ");
        for (i=0; i <25; i++){
            System.out.print(bigQ.get());
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        for (i=0; i < 5; i++){
            System.out.println("Attempting to store " + (char) ('Z'-i));
            smallQ.put((char)('Z'-i));
            System.out.println();
        }
        System.out.println("Contents of smallQ: ");
        for (i = 0; i<4; i++){
            System.out.print(smallQ.get());
        }
    }
}
