package solid.dependancy_inversion;

import java.math.BigDecimal;

public interface Payments {
    void doTransaction(BigDecimal amount);
}
