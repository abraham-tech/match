package entity;
import interfaces.IPayment;

public class PayPal implements IPayment{
    private String account;
    private String method;

    @Override
    public boolean pay(int amount){
        return true;
    }
    
}
