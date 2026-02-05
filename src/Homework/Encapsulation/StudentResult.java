package Homework.Encapsulation;

public class StudentResult {
    private int math;
    private int sci;
    private int eng;
    private int hindi;

    public void setMath(int math) {
        this.math = math;
    }
    public void setSci(int sci) {
        this.sci = sci;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getMath() {
        return math;
    }
    public int getSci() {
        return sci;
    }
    public int getEng() {
        return eng;
    }
    public int getHindi() {
        return hindi;
    }

    void calculate_percentage() {
        double percentage = (math + sci + hindi + eng) / 4.0;
        System.out.println("Percentage = " + percentage);
    }

    public static void main(String[] args) {
        StudentResult s = new StudentResult();

        s.setMath(80);
        s.setSci(70);
        s.setEng(75);
        s.setHindi(85);

        s.calculate_percentage();
    }
}
