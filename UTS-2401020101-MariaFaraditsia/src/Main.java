public class Main {
    public static void main(String[] args) {

        // Soal 1 & 2: Class & Encapsulation
        Course c1 = new Course("PBO", 3, "Pak Andi");
        Course c2 = new Course("Basis Data", -2, "Bu Sari"); // validasi credit
        c1.displayInfo();
        c2.displayInfo();

        // Soal 3: Aggregation (Student punya daftar Course)
        Student s1 = new Student("Budi", "S123");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.showCourses();

        // Soal 4: Inheritance & Polymorphism
        Person[] arr = { new Student2("Tono"), new Lecturer("Pak Dedi") };
        for (Person p : arr) {
            p.introduce();
        }

        // Soal 5: Abstract & Interface
        Assessment exam = new Exam(90);
        Assessment assignment = new Assignment(80);
        System.out.println("Nilai Exam: " + exam.getGrade());
        System.out.println("Nilai Assignment: " + assignment.getGrade());
    }
}
