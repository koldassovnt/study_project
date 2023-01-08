package solid.liskov_substitution;

import java.math.BigDecimal;

public class AccountAfter {
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(numberAccount);
    };
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
}
