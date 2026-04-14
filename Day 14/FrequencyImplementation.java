import java.util.*;
public class FrequencyImplementation {
    public static void main(String[] args) {
        Map<Character , Integer>map=new HashMap<>();
        String s="aabbbcc";
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Frequency Map: " + map);
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("contains 's': " + map.containsKey('s'));
    }
}
