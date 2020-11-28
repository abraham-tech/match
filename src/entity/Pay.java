package entity;


public class Pay {
    private int amount;
    public enum Method {
        SWISH,
        PAYPAL,
        CREDITCARD
    };

    public void pay(int amount, Method method) {
        switch(method) {
            case SWISH:
                Swish swish = new Swish();
                swish.pay(amount);
                break;
            case PAYPAL:
                PayPal payPal = new PayPal();
                payPal.pay(amount);
                break;
            case CREDITCARD:
                CreditCard cr = new CreditCard();
                cr.pay(amount);
                break;
        }
    }
}
