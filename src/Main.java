import People.Employee;
import People.Person;
import People.Student;

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Student("Rusya", "Matveyev", 1));
        personArrayList.add(new Student("re", "er", 4.0));
        personArrayList.add(new Employee("Perega", "Sirat", "Svinopas", 2000000));
        personArrayList.add(new Employee("Tigr", "Big", "Tiger", 10000));


        Collections.sort(personArrayList);
        printData(personArrayList);
    }

    public static void printData(Iterable<Person> personArrayList) {
        for (Person person : personArrayList) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }

    }
}