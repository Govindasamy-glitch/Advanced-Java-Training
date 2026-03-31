class Encapsulation{
    int a;
    Encapsulation(){
        a=10;
    }
    void display(){
        System.out.println("Implementation of Encapsulation "+a);
    }
}
public class EncapsulationImplementation {
    public static void main(String[] args) {
        Encapsulation ec=new Encapsulation();
        ec.display();
    }
}
