package Module3.Practick.Array;


public class ArrayString {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        if(s.length()==0){
            System.out.println(s.length());
        }
        else if(s.length()<400000) {
            String pattern = "[\\s,?'!_.@]+";
            System.out.println(s.trim());
            s = s.trim();
            String[] arr = s.split(pattern);
            System.out.println(arr.length);
            for (String s1 : arr) {
                System.out.println(s1);
            }
        }
    }
}
