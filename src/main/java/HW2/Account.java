package HW2;

public class Account {
    private String name;
    private  double balance;
    private double annualRate = 0.04;

    public Account(String name, double balance ) {
        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }


    public void withdraw(double amt) {

        balance = balance - amt;
   }
//    public Account (String name, double balance) {
//       this.name=name;
//       this.balance=balance;
//
//   }

//   public double  getMonthlyRate(){
//      return annualRate / 12;
//   }
//
//    public double getMonthlyInt(){
//        return getMonthlyRate()* balance;
//    }
//    public void deposit(double amt){
//      balance =balance+  amt;
//    }
//
//    public void withdraw(double amt) {
//        balance = balance - amt;
//    }
//
//    public double getBalance(){
//    return balance;
   // }
}
