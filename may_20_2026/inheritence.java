package may_20_2026;

class vehicle{
    int wheels;
    String color;
    String engine;

    void run(){
        System.out.println("running");
    }
    void brake(){
        System.out.println("Applied the brakes");
    }

}

class car extends vehicle{
    String model;
    int year;
    car(){
        super(); 
    }
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Wheels: "+wheels);
        System.out.println("Color: "+color);
        System.out.println("Engine: "+engine);
        super.run(); 
        super.brake(); 
    }
}
class bike extends vehicle{
    String brand;
    int speed;

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
        System.out.println("Wheels: "+wheels);
        System.out.println("Color: "+color);
        System.out.println("Engine: "+engine);
        super.run(); 
        super.brake();
    }
}
public class inheritence {
    public static void main(String[] args) {
        car c1 = new car();
        c1.model = "Sedan";
        c1.year = 2020;
        c1.wheels = 4;
        c1.color = "Red";
        c1.engine = "V6";
        c1.display();

        System.out.println();

        bike b1 = new bike();
        b1.brand = "Yamaha";
        b1.speed = 150;
        b1.wheels = 2;
        b1.color = "Blue";
        b1.engine = "150cc";
        b1.display();

    }
}