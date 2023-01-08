package solid.interface_segregation;

public class TerminalPaymentServiceAfter implements WebMoneyPayment, CreditCardPayment {
    @Override
    public void payWebMoney() {
        //logic
    }

    @Override
    public void payCreditCard() {
        //logic
    }
}
