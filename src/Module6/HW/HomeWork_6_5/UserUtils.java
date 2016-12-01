package Module6.HW.HomeWork_6_5;




/**
 * Created by user on 30.11.2016.
 */
public class UserUtils {
    UserArray Users = new UserArray();

    public User[] uniqueUsers(User[] users) {
        int elem = 0;
        int count = users.length;
        int countBed = 0;
        int x = 0;
        int y = 0;

        for (int firstLoop = 0; firstLoop < users.length ; firstLoop++) {
            for (int secondLoop = 0; secondLoop < users.length ; secondLoop++) {
                if (users[firstLoop].equals(users[secondLoop]) && firstLoop != secondLoop) {
                    users[secondLoop] = new User (1,1,1);
                    count--;
                    countBed++;
                    System.out.println(users[firstLoop].toString() + " index " + firstLoop);
                }
            }

        }
        for (User el : users){
            System.out.println(el.toString());
        }
        User[] copy = new User[count];
        User[]  rightAr = new User[countBed];
        System.out.println(copy.length);
        System.out.println(countBed);



//        for (User e : copy){
//            System.out.println(e.toString());
 //       }
//        for (int firstLoop = 0; firstLoop < users.length - 1; firstLoop++) {
//                if (users[firstLoop].equals(rightAr[firstLoop]) ) {
//                    copy[y] = users[firstLoop];
//                    System.out.println(copy[y].toString() + " index " + y);
//
//            }
//        }

//            for (int firstLoop = 0; firstLoop < users.length; firstLoop++) {
//                for (int secondLoop = elem; secondLoop < users.length; secondLoop++) {
//                    if (users[firstLoop].equals(users[secondLoop]) && firstLoop != secondLoop) {
//                        System.out.println("nothing");
//                    } else {
//                        copy[firstLoop] = users[firstLoop];
//                        System.out.println("index " + firstLoop + " with index " + secondLoop);
//                    }
//                }
//                elem++;
//
//
//
//
//            }
           return users;
    }
}