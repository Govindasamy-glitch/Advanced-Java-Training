import java.util.*;
class Student implements Comparable<Student>{
    int rollNo;
    String name;
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
}
public class ComparableImplementation{
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        s.add(new Student(10,"John"));
        s.add(new Student(5,"Alice"));
        s.add(new Student(15,"Bob"));
        Collections.sort(s);
    }
}
