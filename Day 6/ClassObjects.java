class Apartments{
    void display(){
        System.out.println("I am inside the Apartment");
    }
}
public class ClassObjects {
    public static void main(String[] args) {
        Apartments ap=new Apartments();
        System.out.println("I am inside the classObjects");
        ap.display();
    }
}
