public class StringBuilderConcept {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);// using toString() function to convert the StringBuilder to String
        sb.append(" World");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
