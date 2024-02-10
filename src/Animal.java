import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
    public String getName() {return this.name;}
    public String getColor() {return this.color;}
    public int getAge() {return this.age;}

    public  void setName (String name){this.name = name;}
    public  void setColor (String name){this.color = color;}
    public  void setAge (String name){this.age = age;}
    public  String presentationAnimal()  {
        return "Я" + " " + color + " " + name + " " + "Мне" + " " + age + " лет";
    }
    public static void hello() {
        System.out.println("Сейчас мы познакомимся с животными");
    }
}


