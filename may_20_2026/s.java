package may_20_2026;

import java.util.ArrayList;

class std {
    Integer a1=90;
    Integer a2=80;

    //boxing   converting primitive to objects
    Integer a3 = Integer.valueOf(80);

    //unboxing converting objects to primitive
    int y = a1;


    void display() {
        System.out.println("Something");
        
    }
}

public class s {
    public static void main(String[] args) {
        System.out.println("Student Details:");
        std student = new std();
        student.display();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println(list.get(0));
        System.out.println(student.a1==student.a2);
    }
}
