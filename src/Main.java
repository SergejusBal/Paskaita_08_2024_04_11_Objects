import org.xml.sax.ext.Locator2;

import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //////////////////////////////////////////////////////////////
        ////////////// Uzduotis 1 objects

        System.out.println();
        System.out.println("Uzduotis object");
        System.out.println();

        Person person1 = new Person("Anna Smith", 5, 35);
        Person person2 = new Person("Anna Smith", 5,35);
        Person person3 = new Person("Donald Lee", 5,35);

        System.out.println("Lyginti vienodus");
        System.out.println(person1.equals(person2));
        System.out.println("Lyginti skirtingus");
        System.out.println(person1.equals(person3));


        Person person4 = person2;
        System.out.println("Tikriname ar tas pats objectas");
        System.out.println(person4.toString().equals(person2.toString()));

        Person person5 = person2.clone();

        System.out.println("Tikriname ar tas pats objectas");
        System.out.println(person5.toString().equals(person2.toString()));

        System.out.println("Lyginti vienodus");
        System.out.println(person5.equals(person2));


        System.out.println("Visu elementu HasHcodai");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());
        System.out.println(person5.hashCode());


        //////////////////////////////////////////////////////////////
        ////////////// Uzduotis 2 objects

        System.out.println();
        System.out.println("Uzduotis 2 object");
        System.out.println();


        Employee employee1 = new Employee("1","Jonas","Maisto",1000.0,new Date(2000,10,10));
        Employee employee2 = new Employee("1","Jonas","Maisto",1000.0,new Date(2000,10,10));
        Employee employee3 = new Employee("2","Marija","Kelioniu",1000.0,new Date(2000,12,10));


        System.out.println("Ar objektai lygus:");
        System.out.println(employee1.equals(employee2));

        System.out.println("Ar objektai lygus:");
        System.out.println(employee3.equals(employee2));


        Employee employee4 = employee1.clone();

        System.out.println("Objektai lygus:");
        System.out.println(employee4.equals(employee1));

        Car car1 = new Car("BMW","2336",2012,"Red",20454500);
        Car car5 = new Car("BMW","2336",2012,"Red",20454500);
        Car car2 = new Car("Ford","12",2002,"Red",2045450);
        Car car3 = new Car("Chervolet","45",2002,"Red",2050045);
        Car car4 = new Car("BMW","1",2000,"Red",40454500);

        ArrayList<Car> masinuListas = new ArrayList<>();
        masinuListas.add(car1);
        masinuListas.add(car2);
        masinuListas.add(car3);
        masinuListas.add(car4);
        masinuListas.add(car5);

        for(Car c: masinuListas){
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Equals metodas");
        System.out.println(car1.equals(car5));

        System.out.println();
        System.out.println("Hashcodes");
        for(Car c: masinuListas){
            System.out.println(c.hashCode());
        }

    }
}