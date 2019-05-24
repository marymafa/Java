import Guice.Guice;
import Injector.Injector;
import AbstractModule.AbsractModule;


public class Main {

    public static void main(String [] args){
        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);
    };

}
