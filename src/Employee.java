public class Employee extends Person {
    private static int id_gen = 1;
    private int id;

    private String position;
    private double salary;

    public void setPosition(String position){
        this.position = position;
    }

    @Override
    public String getPosition(){
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee:" + getId() +". "+ getName() + " " + getSurname();
    }
}
