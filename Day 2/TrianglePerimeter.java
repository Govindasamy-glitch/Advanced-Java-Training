import java.util.*;
public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The Perimeter of the trinagle :"+2*(l+b));
        System.out.println("The area of the Triangle :"+((l*b)/2));
        sc.close();
    }    
}
