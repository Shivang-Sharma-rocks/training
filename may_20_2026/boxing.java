package may_20_2026;

public class boxing {
    public static void main(String[] args) {
    Integer a1=90;
    Integer a2=80;

    //a1==a2 -> references of objects are compared,
    System.out.println(a1.equals(a2)); 
    
    //boxing   converting primitive to objects
    Integer a3 = Integer.valueOf(80);
    System.out.println(a3);

    //unboxing converting objects to primitive
    int y = a1;
    System.out.println(y);
    }
}
