import java.util.*;
public class TreeImplementation {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(10);
        Set<Integer> tailSet = ((TreeSet<Integer>) treeSet).tailSet(5);
        Set<Integer> headSet = ((TreeSet<Integer>) treeSet).headSet(25);
        System.out.println("TreeSet: " + treeSet);
    }
}
