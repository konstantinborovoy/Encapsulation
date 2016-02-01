import devcat.Cat;
import devpeople.People;

/**
 * Created by Константин on 28.01.2016.
 */
public class Main {

    static Cat cat = new Cat(); //Экземпляр класса devcat.Cat
    static People people = new People();//Экземпляр класса devpeople.People

    public static void main(String[] args) {
/////////////////////////////////////////////////////
        cat.setName("ТОМАС");
        cat.setAge(3);
        cat.setBreed("Русская голубая");
/////////////////////////////////////////////////////
        people.setFirstName("Kostya");
        people.setLastName("Borovoy");
        people.setAge(29);
        people.setCat(cat);
/////////////////////////////////////////////////////
        //  System.out.println(cat.age);
        //  System.out.println(cat.breed);
        // System.out.println(cat.name);

        // System.out.println(cat);
//////////////////////////////////////////////////////
        //  System.out.println(devpeople.firstNeme);
        //  System.out.println(devpeople.lastNaime);
        // System.out.println(devpeople.age);

        System.out.println(people);
        cat.say();       //вызываем метод кота
        people.getCat().say();//вызываем метод кота через человека}
    }
}