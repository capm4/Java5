package Module3.Practick.Array;

/**
 * Created by user on 12.11.2016.
 */
public class Coursee {
    private String[] courseTaken = new String[3];
    private String name;
    public Coursee(String[] courses, String name) {
        System.arraycopy(courses,0,courseTaken,0,3);
        this.name = name;
    }

    public String[] getCourseTaken() {
        return courseTaken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseTaken(String[] courseTaken) {
        this.courseTaken = courseTaken;
    }
}
