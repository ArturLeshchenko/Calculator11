package Person;

public class Car {
    private String brand;
    private String model;
    private String stateRegistrationNumber;
    private String color;
    private String owner;

    public Car(String brand, String model, String stateRegistrationNumber, String color, String owner) {
        this.brand = brand;
        this.model = model;
        this.stateRegistrationNumber = stateRegistrationNumber;
        this.color = color;
        this.owner = owner;
    }
    public void presentationCar(){
        System.out.println("Марка моей машины " + brand + " " + model + "Гос.номер " + stateRegistrationNumber +
                " Цвет машины  " + color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", stateRegistrationNumber='" + stateRegistrationNumber + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}

