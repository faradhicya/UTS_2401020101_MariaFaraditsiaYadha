public class Student2 extends Person {
    public Student2(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Saya mahasiswa bernama " + name);
    }
}
