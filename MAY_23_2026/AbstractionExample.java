package MAY_23_2026;
//abstraction

abstract class Animal {
    abstract void sound();

    public void sleep(){
        System.out.println("the animal sleeps");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("the dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("the cat meows");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
        Cat cat = new Cat();
        cat.sound();
        cat.sleep();
    }
}