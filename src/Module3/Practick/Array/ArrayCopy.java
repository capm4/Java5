package Module3.Practick.Array;


public class ArrayCopy {
    public static void main(String[] args) {
//        String[] Arr1 = {"Math", "Geography", "Physics"};
//        String[] courseTaken = new String[3];
//        System.arraycopy(Arr1,3,courseTaken,0,3);
//
//        for (int i=0; i < courseTaken.length; i++) {
//            System.out.print(courseTaken[i] + " ");
//        }
    Coursee cors = new Coursee(new String[]{"Math", "Geography", "Physics"}, "Alex");
        System.out.println(cors.getCourseTaken()[1]);
    }
}
