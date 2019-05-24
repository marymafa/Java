package com.TransactionLog.CreditCard;

import com.TransactionLog.CreditCard.CreditCardProcessor.CreditCardProcessor;
import com.TransactionLog.CreditCard.PaypalCreditCardProcessor.PaypalCreditCardProcessor;

public class Main {
    public static void main(String[] args){
        CreditCardProcessor processor = new PaypalCreditCardProcessor() {
            @Override
            public ChargeResult charge(CreditCard creditCard, boolean amount) {
                return null;
            }

            public ChargeResult charge(ChargeResult chargeresult, boolean amount)  {
                return chargeresult;
            }
        };
        TransactionLog transactionLog = new DatabaseTransactionLog();
        System.out.println("testing" + processor + transactionLog);
    }
}
