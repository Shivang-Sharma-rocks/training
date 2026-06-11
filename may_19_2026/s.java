package may_19_2026;

class std {
    String name;
    int rollNo;
    int age;

    public std(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
    }

    public std(int x) {
        System.out.println("Constructor with integer parameter: " + x);
    }
}

public class s {
    public static void main(String[] args) {
        std s1 = new std("Alice", 101, 20);
        System.out.println("Student Details:");
        s1.display();
        std s2 = new std(10);
        s2.display();
    }
}
