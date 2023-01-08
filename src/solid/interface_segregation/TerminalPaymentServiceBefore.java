package solid.interface_segregation;

public class TerminalPaymentServiceBefore implements PaymentsBefore {
    @Override
    public void payWebMoney() {
        //logic
    }

    @Override
    public void payCreditCard() {
        //logic
    }

    /**
     * TerminalPaymentService не поддерживать проведение оплат по номеру телефона
     */
    @Override
    public void payPhoneNumber() {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
