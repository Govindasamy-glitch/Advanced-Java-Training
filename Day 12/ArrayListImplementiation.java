import java.util.*;
public class ArrayListImplementiation {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(null);
        arr.add(10);
        arr.add(20);
        System.out.println(arr);
        arr.set(0,5);
        System.out.println(arr);
        arr.add(0,0);
        System.out.println(arr);
        System.out.println(arr.get(1));
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.contains(5));
        System.out.println(arr.size());
        arr.add(0);
        System.out.println(arr.indexOf(0));
        System.out.println(arr.lastIndexOf(0));
        arr.clear();
        System.out.println(arr.isEmpty());
    }
    
}