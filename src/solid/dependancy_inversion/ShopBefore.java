package solid.dependancy_inversion;

import java.math.BigDecimal;

public class ShopBefore {
    private final CashBefore cash;

    public ShopBefore(CashBefore cash) {
        this.cash = cash;
    }
    public void doPayment(Object order, BigDecimal amount){
        cash.doTransaction(amount);
    }
}
