package org.designpatterns.strategy.paymentstrategy;

public class CCPayment implements  PaymentStrategy{
    @Override
    public String pay(int amount) {
        String res = amount + " Paid, PaymentDOne via CC";
        return res;
    }
}
