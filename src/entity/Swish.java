package entity;

import interfaces.IPayment;

public class Swish implements IPayment {

    public boolean pay(int amount) {
        System.out.println("Paid " + amount + " via Swish");
        return true;
    }
}
