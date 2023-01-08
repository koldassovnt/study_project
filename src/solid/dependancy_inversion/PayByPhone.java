package solid.dependancy_inversion;

import java.math.BigDecimal;

public class PayByPhone implements Payments {
    @Override
    public void doTransaction(BigDecimal amount) {
        //logic
    }
}
