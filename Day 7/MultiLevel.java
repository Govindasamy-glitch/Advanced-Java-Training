public class MultiLevel {
    public static void main(String [] args)
    {
        GrandSon grandson = new GrandSon();
        grandson.GS();
        grandson.son();

    }
}
class GrandFather
{
    void GF()
    {
        System.out.println("GrandFather");
    }
}
class Son extends GrandFather {
    void son() {
        System.out.println("Son");
    }
}
class GrandSon extends Son
{
   void GS()
   {
       System.out.println("Grandson");
   }
}