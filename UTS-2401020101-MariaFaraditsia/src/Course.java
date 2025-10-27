public class Course {
    private String courseName;
    private int credit;
    private String instructorName;

    public Course(String courseName, int credit, String instructorName) {
        setCredit(credit); // gunakan setter agar tetap tervalidasi
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    // Setter dengan validasi credit tidak boleh negatif
    public void setCredit(int credit) {
        if (credit < 0) {
            System.out.println("Credit tidak boleh negatif. Di-set menjadi 0.");
            this.credit = 0;
        } else {
            this.credit = credit;
        }
    }

    public void displayInfo() {
        System.out.println("Nama Course: " + courseName);
        System.out.println("Jumlah SKS: " + credit);
        System.out.println("Dosen Pengampu: " + instructorName);
        System.out.println();
    }
}
