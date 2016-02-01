package devcat;

/**
 * Created by Константин on 28.01.2016.
 */
//создание объекта
public class Cat {

   // private int age; // модификатор доступа (доступно только в этом классе)
   // public String breed;// доступно везде
    //String name; // доступно по умалчанию только в пакете

//РЕКОМЕНДУЕТСЯ ДЕЛАТЬ ИСКЛЮЧИТЕЛЬНО КАК НИЖЕ

    private int age; // модификатор доступа (доступно только в этом классе)
    private String breed;// доступно везде
    private String name; // доступно по умалчанию только в пакете
 
    // Что бы инициализировать данные переменные в классе Main который находиться на другом уровне используются методы геттеры и сеттеры (Getter/Setter)


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){            // создали метод кота (выводит мяу в Main)
        System.out.println("Myau");
    }

//Переопредиление метода для вывода "Саt" не как адреса в памяти, а его атрибутов.

    @Override                   // надо нажать ctrl+ins и выбрать toString
    public String toString() {
        return "devcat.Cat[Имя: " + name + ", Порода: " + breed + " -  " +age+ " год(а)]";
    }
}
