public interface StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("Append: " + sb);
        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);
        sb.replace(6, 10, "C++");
        System.out.println("Replace: " + sb);
        sb.delete(6, 9);
        System.out.println("Delete: " + sb);
        sb.deleteCharAt(5);
        System.out.println("DeleteCharAt: " + sb);
        sb.reverse();
        System.out.println("Reverse: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("CharAt(2): " + sb.charAt(2));
        sb.setCharAt(2, 'X');
        System.out.println("SetCharAt: " + sb);
        System.out.println("Substring(0,4): " + sb.substring(0, 4));
        String str = sb.toString();
        System.out.println("ToString: " + str);
        sb.ensureCapacity(50);
        System.out.println("EnsureCapacity: " + sb.capacity());
        sb.trimToSize();
        System.out.println("TrimToSize: " + sb.capacity());
    }
}
