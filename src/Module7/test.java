package Module7;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by user on 03.12.2016.
 */
public class test {
    public static class Use{
        String name;
        int id;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Use use = (Use) o;

            if (id != use.id) return false;
            return name.equals(use.name);

        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + id;
            return result;
        }

        @Override
        public String toString() {
            return "Use{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        public Use(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    public static void main(String[] args) {

        List<Use> set = new ArrayList<>();
        List<Use> list = new ArrayList<>();
        set.add(new Use("vasz",1));
        set.add(new Use("vasz",2));
        set.add(new Use("vasz",3));
        set.add(new Use("vasi",4));

        long id = 3;
        String is = "vasz";

        System.out.println(set.stream().filter((p) -> p.getId()==id).collect(Collectors.toList()));

        set.stream().forEach((p)-> System.out.println(p));
        //set.get(set.stream().forEach((p) -> p.toString().contains("id="+x)));
        //Boolean as = set.contains(1);
        //System.out.println(as);
        //System.out.println(list);
    }
}
