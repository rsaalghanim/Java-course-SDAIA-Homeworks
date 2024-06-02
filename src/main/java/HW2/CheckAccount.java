package HW2;

import HW2.Account;

public class CheckAccount extends Account {
    public CheckAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amt) {
        if(getBalance() - amt >0){
        super.withdraw(amt);
            System.out.println("valid");
    }else {
            System.out.println("invalid");
        }
    }

}
