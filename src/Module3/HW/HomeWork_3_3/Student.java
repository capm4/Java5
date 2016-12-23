package Module3.HW.HomeWork_3_3;


public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] courseTaken = new Course[3];
    private int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName,Course... courses) {
        this.lastName = lastName;
        System.arraycopy(courses,0,courseTaken,0,3);
    }

    public Student(String firstName, String lastName, int group, Course[] courses, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        System.arraycopy(courses,0,courseTaken,0,3);
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCourseTaken() {
        return courseTaken;
    }

    public void setCourseTaken(Course[] courseTaken) {
        this.courseTaken = courseTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
