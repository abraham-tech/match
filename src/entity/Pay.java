package entity;

import interfaces.IPayment;

public class Pay {
    private int amount;
    private IPayment payment;

    public Pay() {
    }

    public boolean pay(int amount) {
        return this.payment.pay(amount);
    }
}
