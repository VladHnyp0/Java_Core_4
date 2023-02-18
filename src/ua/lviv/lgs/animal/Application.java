package ua.lviv.lgs.animal;

public class Application {
    public static void main(String[] args) {
        Animal animal = new Animal("Leopard", 20.5, 12);
        System.out.println(animal.getName() + ". Animal's speed: " + animal.getSpeed() + " km/h. Age: " + animal.getAge());

        System.out.println("---------------------------------");
        animal.setName("Cat");
        animal.setSpeed(10);
        animal.setAge(4);
        System.out.println(animal.getName() + ". Animal's speed: " + animal.getSpeed() + " km/h. Age: " + animal.getAge());
    }
}
