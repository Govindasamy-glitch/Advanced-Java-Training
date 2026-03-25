public class ConstructorOverLoading {
    ConstructorOverLoading(String i){
        System.out.println("Parameter Constructor and Overloadingr");
    }
    ConstructorOverLoading(int x){
        System.out.println("Parameter Constructor and Overloading");
    }
    public static void main(String[] args){
        System.out.println("Constructor OverLoaading Examplee");
        ConstructorOverLoading co=new ConstructorOverLoading(10);
        ConstructorOverLoading cop=new ConstructorOverLoading("Hope 1");
    }
}
