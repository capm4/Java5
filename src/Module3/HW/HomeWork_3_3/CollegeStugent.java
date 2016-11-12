package Module3.HW.HomeWork_3_3;


public class CollegeStugent extends Student {
    private String collegeName;
    private int rating;
    private long id;


    public CollegeStugent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStugent(String lastName, Course[] courses) {
        super(lastName, courses);
    }

    public CollegeStugent(String firstName, String lastName, int group, Course[] courses, int age, String collegeName, int rating, long id) {
        super(firstName, lastName, group, courses, age);
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
