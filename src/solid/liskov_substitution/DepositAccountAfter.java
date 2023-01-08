package solid.liskov_substitution;

import java.math.BigDecimal;

public class DepositAccountAfter extends AccountAfter {
    @Override
    public BigDecimal balance(String numberAccount) {
        return new BigDecimal(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        //logic
    }
}
