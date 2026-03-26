
public class SuperExample {
    public static void main(String [] args)
    {
         ChildAnimal ca = new ChildAnimal();
         ca.display();
    }
}
class MotherAnimal
{
     public void display()
     {
         System.out.println("This is thye Mother Animal");
     }
}
class ChildAnimal extends MotherAnimal
{
     public void display()
     {
         super.display();
         System.out.println("This is the child Animal");
     }
}
