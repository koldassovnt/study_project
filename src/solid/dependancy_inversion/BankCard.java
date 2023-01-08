package solid.dependancy_inversion;

import java.math.BigDecimal;

public class BankCard implements Payments{
    @Override
    public void doTransaction(BigDecimal amount) {
        //logic
    }
}
