package design_patterns.structural.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        PBank pbank = new PBank();
        pbank.getBalance();

        PBank abank = new PBankAdapter(new ABank());
        abank.getBalance();
    }
}
