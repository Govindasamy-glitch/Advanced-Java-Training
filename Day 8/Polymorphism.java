class Animal{
    void sound(){
        System.out.println("All aniamls have different sound");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog will bark");
    }
}
class Cat extends Animal{
    void sound(){
        super.sound();
        System.out.println("Cat will make a meow");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        animal=new Cat();
        animal.sound();
        animal=new Dog();
        animal.sound();
    }
}
