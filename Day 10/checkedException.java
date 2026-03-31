import java.io.FileReader;

public class checkedException {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("Hope-B1.txt");
            System.out.println(fr);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
