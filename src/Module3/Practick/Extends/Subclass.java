package Module3.Practick.Extends;

public class Subclass extends Superclass {

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public  void methDer(int a, int b){
        super.methD(a , b);
        int y = a * b;
        System.out.println("Multi is " + y);
    }

    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
        s.methDer(4,8);
    }
}
