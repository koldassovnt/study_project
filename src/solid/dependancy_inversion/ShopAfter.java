package solid.dependancy_inversion;

import java.math.BigDecimal;

public class ShopAfter {
    private final Payments payments;

    public ShopAfter(Payments payments) {
        this.payments = payments;
    }

    public void doPayment(Object order, BigDecimal amount) {
        payments.doTransaction(amount);
    }

    //Сейчас наш магазин слабо связан с системой оплаты, то есть он зависит от
    //абстракции, и уже не важно каким способом оплаты будут пользоваться
    //(наличными, картой или телефоном) все будет работать.
}
