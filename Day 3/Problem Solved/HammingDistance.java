import java.util.*;

class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        hammingDistance(num1,num2);
        sc.close();
    }
    public static int hammingDistance(int x, int y) {
        int count = 0;
        while(x > 0 || y > 0){
            int bit1 = x % 2;
            int bit2 = y % 2;
            if(bit1 != bit2){
                count++;
            }
            x = x / 2;
            y = y / 2;
        }
        return count;
    }
}