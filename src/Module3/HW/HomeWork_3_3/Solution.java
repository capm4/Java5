package Module3.HW.HomeWork_3_3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(new Date(99, 2, 18), "Alex");
        Course course2 = new Course(new Date(2000, 3, 18), "Olga");
        Course course3 = new Course(new Date(2001, 4, 18), "Elvira");
        Course course4 = new Course(11210,"Alex", "Bulba");
        Course course5 = new Course(10,"Olga" ,"Bulba");

        Student student1 = new Student("Alex", "Kruglov", 2);
        Student student2 = new Student(new Course[2], 23);

        CollegeStugent collegeStugent1 = new CollegeStugent("Andew", "Nort", 14);
        CollegeStugent collegeStugent2 = new CollegeStugent(new Course[3], 12);
        CollegeStugent collegeStugent3 = new CollegeStugent("Andew", "Nort", 14, new Course[4], 16, "NULP", 4, 1);

        SpecialStudent SpecialStudent1 = new SpecialStudent("Oleg", "Blog", 4);
        SpecialStudent SpecialStudent2 = new SpecialStudent(new Course[1], 19);
        SpecialStudent SpecialStudent3 = new SpecialStudent("Vadum", "Lozik", 27, new Course[5], 17, "KNEU", 5, 1, 12344321);

    }
}
