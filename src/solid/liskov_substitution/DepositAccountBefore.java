package solid.liskov_substitution;

import java.math.BigDecimal;

public class DepositAccountBefore extends AccountBefore {
    @Override
    public BigDecimal balance(String numberAccount) {
        return new BigDecimal(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        //logic
    }

    /**
     * депозитный счет - не должен поддерживать проведение оплаты
     */
    @Override
    public void payment(String numberAccount, BigDecimal sum) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
