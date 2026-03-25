class Apartment1{
    Apartment1(){
        
    }
    void rooms(int b,int k,int w,int h,int d,int p) {
        System.out.println("There is "+b+" Bedroom without attached "+w+" washroom and has "+k+" Kitchen with "+d+" Dinning Hall with "+h+" Hall and "+p+" Playground");
        
    }
}
class Apartment2{
    Apartment2(){
        
    }
    void rooms(int b,int k,int w,int h,int d,int p){
        System.out.println("There is "+b+" Bedroom attached "+w+" washroom and has "+k+" Kitchen with "+d+" Dinning Hall with "+h+" Hall and "+p+" public Playground");
    }
    
}
class Apartment3{
    Apartment3(){

    }
    void rooms(int b,int k,int w,int h,int d,int p){
        System.out.println("There is "+b+" Bedroom without attached "+w+" washroom and has "+k+" public Kitchen with "+d+" Dinning Hall with "+h+" Hall and "+p+" public Playground");
    }
}
public class Apartments{
    public static void main(String[] args) {
    Apartment1 ap1=new Apartment1();
    ap1.rooms(1,1,1,1,1,1);
    
    Apartment2 ap2=new Apartment2();
    ap2.rooms(2, 1, 1, 1, 1, 1);
    Apartment3 ap3=new Apartment3();
    ap3.rooms(4,4,2,1,4,1);


    }
}
