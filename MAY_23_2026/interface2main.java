package MAY_23_2026;

interface Dog{
    void sound();
}

interface Cat{
    void sound();
}

class puppy implements Cat, Dog{
    public void sound(){
        System.out.println("Puppy sound");
    }
}
public class interface2main {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.sound();
    }
}
