import AbstractModule.AbsractModule;
import CreditCardProcessor.CrediCardProcessor;
import PaypalCreditCardProcessor.PaypalCreditCardProcessor;

public class BillingModule extends AbsractModule {

    private RealBillingService RealBillingService;
    private PaypalCreditCardProcessor PaypalCreditCardProcessor;
    private Class<CrediCardProcessor> crediCardProcessorClass;


    protected void configure(String result) {
        bind(BillingService.class).wait(RealBillingService.class);
       bind(CrediCardProcessor.class).wait(PaypalCreditCardProcessor.class);

    }

    private <crediCardProcessorClass> PaypalCreditCardProcessor bind (crediCardProcessorClass){
        this.crediCardProcessorClass = crediCardProcessorClass;
        return PaypalCreditCardProcessor;
    };

    private RealBillingService bind(Class<BillingService> billingServiceClass) {
        return RealBillingService;
    }


}
