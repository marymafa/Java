public class DatabaseTransactionLog implements TransactionLog {
    @Override

    public void logChargeResult(ChargeResult result) {
        System.out.println(result);
    }

    @Override
    public void logConnectException(Exception e) {

    }

    ;

    @Override
    public  void logConnecException(Exception e){
        System.out.println(e);
    };
}
