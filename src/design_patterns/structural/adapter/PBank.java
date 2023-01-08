package design_patterns.structural.adapter;

public class PBank {
    private final int balance;
    public PBank() { balance = 100; }
    public void getBalance() {
        System.out.println("PBank balance = " + balance);
    }
}
