package Module3.HW.HomeWork_3_3;


public class CollegeStugent extends Student {
    private String collegeName;
    private int rating;
    private long id;


    public CollegeStugent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStugent(Course[] courseTaken, int age) {
        super(courseTaken, age);
    }

    public CollegeStugent(String firstName, String lastName, int group, Course[] courseTaken, int age, String collegeName, int rating, long id) {
        super(firstName, lastName, group, courseTaken, age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStugent(Course[] courseTaken, int age, String collegeName, int rating, long id) {
        super(courseTaken, age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
