public class Student extends Person{
    private static int id_gen = 1;
    private int id;
    private double GPA;
    private String name;

    private final double stipend = 36660;

    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA() {
        return GPA;
    }

    public Student() {
        super();
    }

    public Student(String name, String surname, double GPA) {
        super(name, surname);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student" +
                ":" + getId() +
                "." + getName() + " " + getSurname();
    }

    @Override
    public double getPaymentAmount() {
        if (GPA > 2.67)
            return stipend;

        else
            return 0;
    }


}
