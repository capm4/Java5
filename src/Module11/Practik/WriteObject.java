package Module11.Practik;

import java.io.*;

/**
 * Created by user on 01.01.2017.
 */
public class WriteObject {
    public static void main(String args[]) {

        WriteObject obj = new WriteObject();

        Address address = new Address();
        address.setStreet("wall street");
        address.setCountry("united state");

        obj.serializeAddress(address);
        try (ObjectInputStream f = new ObjectInputStream(
                        new FileInputStream("d:\\address.ser"))){
            System.out.println(f.readObject());
        }catch (IOException e){
            System.out.println("I/O Error : " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void serializeAddress(Address address) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("d:\\address.ser"))) {

            oos.writeObject(address);
            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
}
