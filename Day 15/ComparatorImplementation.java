import java.util.*;

// Student class
class Student {
    int rollNo;
    int age;
    double mark;
    Student(int rollNo, int age, double mark) {
        this.rollNo = rollNo;
        this.age = age;
        this.mark = mark;
    }
    public String toString() {
        return "Roll No: " + rollNo + " Age: " + age + " Mark: " + mark;
    }
}
public class ComparatorImplementation {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(15, 15, 20.5));
        s.add(new Student(16, 15, 21.5));
        s.add(new Student(5, 25, 70.70));
        s.add(new Student(2, 5, 100.0));
        s.add(new Student(2, 5, 90.0));
        Collections.sort(s, new AgeComparator());
        System.out.println("Sorted by Age:");
        for (Student st : s) {
            System.out.println(st);
        }
        System.out.println();
        Collections.sort(s, new RollNoComparator());
        System.out.println("Sorted by Roll No:");
        for (Student st : s) {
            System.out.println(st);
        }
    }
}
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}
class RollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}