

public class W5Quiz3 {
    public static String duplicate (String s) {
        String t = s + s;
        return t;
    }

     public static void main(String[] args) {
        String s1 = "Hi";
        s1 = duplicate(s1);
        String t1 = "Bye";
        t1 = duplicate(duplicate(t1));
        System.out.println(s1 + t1);
        
     }
}
