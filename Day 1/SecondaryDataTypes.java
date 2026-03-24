public class SecondaryDataTypes {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);
        String s3=new String("Hello");
        String s4=new String("Hello");
        System.out.println(s3==s4);
        String s5=new String();
        String s6=new String();
        s5="World";
        s6="World";
        System.out.println(s5==s6);
    }
}