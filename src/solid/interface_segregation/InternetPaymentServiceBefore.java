package solid.interface_segregation;

public class InternetPaymentServiceBefore implements PaymentsBefore {
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
