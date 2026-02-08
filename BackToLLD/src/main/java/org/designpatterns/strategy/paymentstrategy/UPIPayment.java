package org.designpatterns.strategy.paymentstrategy;

public class UPIPayment implements  PaymentStrategy{

    @Override
    public String pay(int amount) {
        String res = amount + " Paid Via UPI";
        return res;
    }
}
