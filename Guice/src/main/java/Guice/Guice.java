package Guice;

import BillingModule.BillingModule;
import Injector.Injector;

public class Guice {

    private static Injector Injector;

    public static Injector createInjector(BillingModule billingModule) {
        return  Injector;

    }
}
