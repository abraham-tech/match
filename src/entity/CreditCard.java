package entity;

import interfaces.IPayment;

public class CreditCard implements IPayment{
    private String account;
    private String method;

    @Override
    public boolean pay(int amount){
        return true;
    }
    
}
