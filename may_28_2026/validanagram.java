package may_28_2026;

public class validanagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        
        for(String str : s.split("")) {
            if(!t.contains(str)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
