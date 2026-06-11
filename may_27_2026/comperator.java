package may_27_2026;

import java.util.*;

class Student {
    String Id;
    String name;
    int marks;

    public Student(String Id, String name, int marks) {
        this.Id = Id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + marks;
    }
}
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}

public class comperator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("betn1ai24031", "Shivang Sharma", 78));
        students.add(new Student("betn1ai24032", "Aarav Patel", 85));
        students.add(new Student("betn1ai24033", "Ananya Singh", 92));
        students.add(new Student("betn1ai24034", "Rohan Mehta", 80));
        
      /*   Collections.sort(students, new MarksComparator()); */
        Collections.sort(students, (s1, s2)-> (s2.marks - s1.marks));
        System.out.println();
        System.out.println(students);
    }
}
