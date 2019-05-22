package TransactionLog;

public class TransactionLog {
    protected CreditCardProcessorFactory logger;

    public TransactionLog(Loger logger) {
        this.logger = logger;
    }
}
