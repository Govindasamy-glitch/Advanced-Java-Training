import java.util.*;
public class SortingLambda {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("Cake");
        words.add("Banana");
        words.add("Apple");
        words.add("Watermelon");
        words.add("Muskmelon");
        words.add("Grapes");
        words.add("Apple");
        words.sort(String::compareTo);
        System.out.println(words); 

    }
}
