package design_patterns.structural.adapter;

public class PBankAdapter extends PBank {
    private final ABank abank;
    public PBankAdapter(ABank abank) {
        this.abank = abank;
    }
    public void getBalance() {
        abank.getBalance();
    }
}
