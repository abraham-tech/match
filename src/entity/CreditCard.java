package match.src.entity;
import match.src.interfaces.IPayment;

public class CreditCard implements IPayment{
    private String account;
    private String method;

    @Override
    public boolean pay(int amount){
        return true;
    }
    
}
