package com.TransactionLog.CreditCard.PaypalCreditCardProcessor;

import com.TransactionLog.CreditCard.ChargeResult;
import com.TransactionLog.CreditCard.CreditCardProcessor.CreditCardProcessor;

public abstract class PaypalCreditCardProcessor implements CreditCardProcessor {
    private ChargeResult chargeresult;

    public static ChargeResult charge(ChargeResult chargeresult){
        return  chargeresult;
    }

}
