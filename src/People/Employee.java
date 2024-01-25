package People;

import People.Person;

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



    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "People.Employee:" + getId() +". "+ getName() + " " + getSurname();
    }
}
