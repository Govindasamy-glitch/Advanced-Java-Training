import java.util.*;
public class setImplementation {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(1);
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        System.out.println(set.contains(1));
        set.add(0);
        System.out.println(set);
    }
        
}
