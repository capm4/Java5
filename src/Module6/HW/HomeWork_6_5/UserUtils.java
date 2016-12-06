package Module6.HW.HomeWork_6_5;


import java.sql.Array;
import java.util.Arrays;

/**
 * Created by user on 30.11.2016.
 */
public class UserUtils {
    public User[] uniqueUsers(User[] users) {
        int count = 0;
        int copyLenth;
        int eleOfArra = 0;
        for (int firstLoop = 0; firstLoop <= users.length-1; firstLoop++) {
            for (int secondLoop = 0; secondLoop <= users.length-1; secondLoop++) {
                if (users[firstLoop]!= null && users[firstLoop].equals(users[secondLoop]) && firstLoop < secondLoop && firstLoop != secondLoop)  {
                    count++;
                    System.out.println(users[firstLoop]);
                    users[secondLoop] = null;
                    System.out.println(users[secondLoop] + " " + secondLoop);

                }
            }
        }

        copyLenth = users.length-count;
        User[] copy = new User[copyLenth];


        for ( int elemForCopy = 0; elemForCopy<users.length-1;elemForCopy++){
            if (users[elemForCopy] == null ){continue;}
            else{    copy[eleOfArra] = users[elemForCopy];}
                eleOfArra++;
            }


        users = Arrays.copyOf(copy,copy.length);

        System.out.println("==========================================================\n");
        System.out.println("afte method uniqueUsers user array looks like :");
        for (User eleOfArr : users){
            System.out.println(eleOfArr.toString());
        }
        System.out.println("==========================================================\n");
           return users;
    }

    public User[] usersWithContitionalBalance(User[] users, int balance){
        int countArr = 0;
        int countForCopy = 0;
        for (User elemOfArr : users){
            if (elemOfArr.getBalace() == balance){
                countArr++;
            }
        }
        User[] copy = new User[countArr];
        for (User elemOfArr : users){
            if (elemOfArr.getBalace() == balance){
                copy[countForCopy] = elemOfArr;
                countForCopy++;
            }
        }
        users = Arrays.copyOf(copy,copy.length);


        System.out.println("==========================================================\n");
        System.out.println("afte method usersWithContitionalBalance with balance - " + balance + " user array looks like :");
        for (User eleOfArr : users){
            System.out.println(eleOfArr.toString());
        }
        System.out.println("==========================================================\n");

        return users;
    }

    final public User[] paySalaryToUsers(User[] users){
        for (User elemOfArr : users){
            elemOfArr.setSalary(elemOfArr.getSalary()+ elemOfArr.getSalary());
        }
        System.out.println("==========================================================\n");
        System.out.println("afte method paySalaryToUsers users array of salsry looks like :");
        for (User eleOfArr : users){
            System.out.println(eleOfArr.getSalary());
        }
        System.out.println("==========================================================\n");
        return users;
    }


    final public long[] getUsersId(User[] users){
        long[] UsersId = new long[users.length];
        int countForArr=0;
        for (User elemOfArr : users){
            UsersId[countForArr] = elemOfArr.getId();
            countForArr++;
        }
        System.out.println("==========================================================\n");
        System.out.println("afte method getUsersId getUserId array looks like :");
        for (long eleOfArr : UsersId){
            System.out.println(eleOfArr);
        }
        System.out.println("==========================================================\n");

        return UsersId;
    }
    public User[] deleteEmptyUsers(User[] users){
        int countForCopyL = 0;
        int count = 0;
        User[] copy;
        for (User elemOfArr : users){
            if (elemOfArr.equals(null)){
                countForCopyL++;
            }
        }
        copy = new User[users.length-countForCopyL];
        for (User elemOfArr : users){
            if (!elemOfArr.equals(null)){
                copy[count] = elemOfArr;
                count++;
            }
        }
        users = Arrays.copyOf(copy,copy.length);

        System.out.println("==========================================================\n");
        System.out.println("afte method deleteEmptyUsers user array looks like :");
        for (User eleOfArr : users){
            System.out.println(eleOfArr.toString());
        }
        System.out.println("==========================================================\n");

        return users;
    }

//    public boolean findUser(User[] user, int index){
//        boolean ArrBoolean = false;
//        for (int count = 0; count<user.length; count++){
//            if (user[index].equals(user[count]) && index != count && index < count){
//                ArrBoolean = true;
//                continue;
//            }
//        }
//        return ArrBoolean;
//    }

}