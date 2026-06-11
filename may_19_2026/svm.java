package may_19_2026;

import java.util.Scanner;

class student {
    String name;
    int rollNo;
    int age;

    public student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
    }
    public student(int x){
        System.out.println("Constructor with integer parameter: " + x);
    }

}

public class svm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        student s1 = new student(name, rollNo, age);
        System.out.println("Student Details:");
        s1.display();
        scanner.close();
        System.out.println("DOB: " + (java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - age));
        student s2 = new student(10);
        s2.display();scanner.close();
    }
}
