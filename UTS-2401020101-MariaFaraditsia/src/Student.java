import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private ArrayList<Course> courses = new ArrayList<>(); // daftar course

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void addCourse(Course c) {
        courses.add(c);
        System.out.println(name + " mengambil mata kuliah: " + c);
    }

    public void showCourses() {
        System.out.println("Daftar mata kuliah " + name + ":");
        for (Course c : courses) {
            c.displayInfo();
        }
    }
}
