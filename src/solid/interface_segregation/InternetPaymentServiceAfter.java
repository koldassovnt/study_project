package solid.interface_segregation;

public class InternetPaymentServiceAfter implements WebMoneyPayment, CreditCardPayment, PhoneNumberPayment {
    @Override
    public void payWebMoney() {
        //logic
    }

    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payPhoneNumber() {
        //logic
    }
}
