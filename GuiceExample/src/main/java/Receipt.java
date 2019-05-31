public class Receipt {
    static ChargeResult hasSuccessfulCharge = new ChargeResult( true );

    public static Receipt forSuccessfulCharge(Receipt amount) {
    // return Receipt.forSuccessfulCharge( amount );
return new Receipt();}

    public static Receipt forDeclinedCharge(String  message){
        return Receipt.forDeclinedCharge( message );
    }

    public static Receipt forSystemFailure(String message) {
        return Receipt.forSystemFailure( message );
    }

    public boolean hasSuccessfulCharge() {
        return true;
    }

    public int getAmountOfCharge() {
        return 100;
    }
}
