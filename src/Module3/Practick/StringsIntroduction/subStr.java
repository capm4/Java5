package Module3.Practick.StringsIntroduction;


public class subStr{
    public void  substring() {
        String A = "hello";
        String B = "java";

        System.out.println(A.length() + B.length());
        if (A.charAt(0) > B.charAt(0)) System.out.println("Yes");
        else System.out.println("No");

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
    public void subsringStartEnd(){
        String s = "Helloworld";
        System.out.println(s.substring(3,7));
    }
    public static int sos(){return 1 + 2;}

}
