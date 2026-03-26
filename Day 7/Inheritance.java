class Parent{
    void display(){
        System.out.println("I am inside Parent class");
    }
}class Child extends Parent{
    void display1(){
        System.out.println("I am inside parent but called by child");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        System.out.println("Inside Main Function");
        Child c=new Child();
        c.display();
        c.display1();
    }
}
