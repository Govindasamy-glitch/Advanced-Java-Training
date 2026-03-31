class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class Bank{
    private double balance;
    void deposit(int amount) throws InsufficientBalanceException{
        if(amount>0){
            balance+=balance;
        }else if(amount<=0){
            throw new InsufficientBalanceException("Amount can't be 0 or negative");
        }
    }
    void withdraw(int amount)throws InsufficientBalanceException{
        if(balance<0){
            throw new InsufficientBalanceException("Balance Insufficient");
        }else if(amount>balance){
            throw new InsufficientBalanceException("Amount is higher than balance");
        }else{
            balance-=amount;
            System.out.println("Amount Withdrawn");
        }
    }
    void getBalance(){
        System.out.println("Account Balance is: "+balance);
    }
}
public class throwsExceptionExample {
    public static void main(String[] args) {
        Bank b=new Bank();
        try{
            b.deposit(20);
            b.getBalance();
            b.deposit(-20);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }try{
            b.withdraw(10);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        b.getBalance();
    }
}
