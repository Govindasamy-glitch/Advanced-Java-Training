class Animal{
    void display(){
        System.out.println("There are multiple animals choose 1 and mention it'z sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat Mewow");
    }
}
public class RealTimeExample {
    public static void main(String[] args) {
        Dog dg=new Dog();
        System.out.println(dg.hashCode());
        dg.sound();
        Cat ct=new Cat();
        ct.sound();
    }
}
