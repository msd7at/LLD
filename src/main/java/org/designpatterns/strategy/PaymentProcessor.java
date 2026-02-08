package org.designpatterns.strategy;

import org.designpatterns.strategy.paymentstrategy.PaymentStrategy;

public class PaymentProcessor {

    PaymentStrategy paymentStrategy;

    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public String makePayment(int amt){
        if (paymentStrategy == null){
            return "No Payment Strategy setup";
        }

        return
                paymentStrategy.pay(amt);
    }
}
