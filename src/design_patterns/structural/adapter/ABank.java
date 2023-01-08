package design_patterns.structural.adapter;

public class ABank {
    private final int balance;
    public ABank() { balance = 200; }
    public void getBalance() {
        System.out.println("ABank balance = " + balance);
    }
}
