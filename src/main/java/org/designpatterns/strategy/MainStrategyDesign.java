package org.designpatterns.strategy;

import org.designpatterns.strategy.paymentstrategy.CCPayment;
import org.designpatterns.strategy.paymentstrategy.PaymentStrategy;
import org.designpatterns.strategy.paymentstrategy.UPIPayment;

public class MainStrategyDesign {

    public static void main(String[] args) {
        PaymentProcessor paymentCC = new PaymentProcessor(new CCPayment());
        System.out.println(paymentCC.makePayment(120));

        PaymentProcessor paymentUPI = new PaymentProcessor(new UPIPayment());
        System.out.println(paymentUPI.makePayment(156));
    }


}
