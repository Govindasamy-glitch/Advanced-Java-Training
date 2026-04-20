class Bank{
    int balance=1000;
    synchronized void withdraw(int amount){
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" "+" is withdrawing");
            balance-=amount;
            System.out.println("Remaining Amount is :"+balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
public class ConcurrencyImplementation {
    public static void main(String[] args) {
        Bank b=new Bank();
        Runnable task=()->{
            b.withdraw(700);
        };
        Thread t1=new Thread(task,"User 1");
        Thread t2=new Thread(task,"USer 2");
        t1.start();
        t2.start();
    }
}
