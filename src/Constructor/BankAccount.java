    package Constructor;

    public class BankAccount {
        int accountNumber;
        String accountHolder;
        double balance;

        BankAccount(int accountNumber, String accountHolder){
            this.accountNumber=accountNumber;
            this.accountHolder=accountHolder;
        }

        BankAccount(int accountNumber, String accountHolder,double balance){
            this.accountNumber=accountNumber;
            this.accountHolder=accountHolder;
            this.balance=balance;
        }

        void deposit(double amount ){
            if (amount>0){
                balance = balance + amount;
            }else {
                System.out.println("please enter correct amount");
            }
        }

        void  withdraw(double amount){
            if (amount <= balance) {
                balance = balance - amount;
           }else {
               System.out.println("Insufficent balance");
           }
        }

        void  display(){

            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
            System.out.println("--------------------");
        }

    }
    class  main{
        public static void main(String[] args) {

            BankAccount b = new BankAccount(12345, "Rohan");
            b.deposit(2500);
            b.withdraw(500);
            b.display();

            BankAccount b1 = new BankAccount(67890, "Rohan", 6786.0);
            b1.deposit(250);
            b1.withdraw(1000);
            b1.display();
        }
    }