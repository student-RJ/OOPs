package Homework.Encapsulation;

public class BankAccount {
    private  String Name;
    private  int Ac_no;
    private  double balance;

    public void setName(String name){
        this.Name = name;
    }
    public void setAc_no(int Ac_no){
        this.Ac_no=Ac_no;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    public String Name(){
        return Name;
    }
    public int Ac_no(){
        return Ac_no;
    }
    public double balance(){
        return balance;
    }

    void deposit(double amount) {
        balance = balance+ amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Current Balance: " + balance);
        System.out.println("----------------------------------------");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance =balance- amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount b =new BankAccount();

      b.setName("Rohan Jadhav");
      b.setAc_no(278136128);
      b.setBalance(2500);

      b.deposit(2500);
      b.withdraw(3000);
    }
}
