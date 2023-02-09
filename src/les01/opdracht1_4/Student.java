package les01.opdracht1_4;

public class Student {
    private String naam;

    public Student(String nm) {
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Deze student heet " + naam;
    }
}
