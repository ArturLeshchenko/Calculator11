import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Волк", 20, "серый");
        Animal animal2 = new Animal("Слон", 50, "белый");
        Animal animal3 = new Animal("Жираф", 1, "желтый в клетку");
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        Animal.hello();
        for (Animal animal:animalList){

            System.out.println(animal.presentationAnimal());
        }
    }
}
