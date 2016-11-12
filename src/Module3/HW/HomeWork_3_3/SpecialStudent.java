package Module3.HW.HomeWork_3_3;


public class SpecialStudent extends CollegeStugent {

    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] courses) {
        super(lastName, courses);
    }

    public SpecialStudent(String firstName, String lastName, int group, Course[] courses, int age, String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, group, courses, age, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
