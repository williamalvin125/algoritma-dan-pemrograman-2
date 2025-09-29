package latihan;

public class ThisAndSuperOOPExercise {

    public static void main(String[] args) {
            Dog dog = new Dog("Buddy", "Labrador");
            System.out.println("Dog name: " + dog.name);
            System.out.println("Dog breed: " + dog.breed);
            dog.sound();
        }
    }

    class Animal {
        String name;
    
        Animal(String name) {
            this.name = name;
        }
    
        void sound() {
            System.out.println("Animal sound");
        }
    }
    
    class Dog extends Animal {
        String breed;
    
        Dog(String name, String breed) {
            super(name); // Memanggil konstruktor superclass Animal
            this.breed = breed;
        }
    
        void sound() {
            super.sound(); // Memanggil metode sound() dari superclass Animal
            System.out.println("Dog barks");
        }
    }
