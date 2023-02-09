package les01.opdracht1_5;

public class Student {
    private String naam;
    private int studentNummer;

    public Student(String nm) {
        naam = nm;
    }

    public Student(String nm, int stNr) {
        naam = nm;
        studentNummer = stNr;
    }

    public String getNaam() {
        return naam;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int stnr) {
        studentNummer = stnr;
    }

    @Override
    public String toString() {
        return "Deze student heet " + naam + " en heeft nummer: " + studentNummer;
    }
}
