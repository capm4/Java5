package Module3.Practick.WrapsExamples;

public class WrapsExamples {
    public static void main(String[] args) {
        String str = "1111111121233111";
        long a = Long.parseLong(str);
        Long  b = new Long(1000212222);
        long d = 1301311111;
        System.out.println(str + " String and int " + a);
        System.out.println("Byte is "+  Long.bitCount(a));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE+" "+Long.BYTES+" "+Long.compare(b, d) +" " + Long.hashCode(122132) + " " +Long.reverse(d) );
        System.out.println(Long.sum(b, d) + " " + Long.toBinaryString(d));
    }
}
