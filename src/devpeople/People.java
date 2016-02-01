package devpeople;

import devcat.Cat;

/**
 * Created by Константин on 28.01.2016.
 */
public class People {

    private String  firstName;
    private String  lastName;
    private int     age;

    Cat cat;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "devpeople.People[Имя: " +firstName+ ", Фамилия: " +lastName+ ", Возраст - " +age+ ", год(а). Есть кот: " +cat+ "]";
    }
}