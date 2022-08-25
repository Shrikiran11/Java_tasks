class Animal {

    // default or no-arg constructor

    // parameterized constructor
    Animal(String type) {
        System.out.println("Type: " + type);
    }
}

class Dog extends Animal {

    // default constructor
    Dog() {
        super("dog");
        // calling parameterized constructor of the superclass

        System.out.println("I am a dog");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

    }
}
