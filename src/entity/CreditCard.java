package entity;

import interfaces.IPayment;

public class CreditCard implements IPayment {

    public boolean pay(int amount) {
        System.out.println("Paid " + amount + " via CR");
        return true;
    }
}
