package solid.liskov_substitution;

import java.math.BigDecimal;

public class AccountBefore {
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(numberAccount);
    };
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
    public void payment(String numberAccount, BigDecimal sum){
        //logic
    }
}
