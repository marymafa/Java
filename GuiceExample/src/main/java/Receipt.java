public class Receipt {
    public static Receipt forSuccessfulCharge(Receipt amount) {
       return Receipt.forSuccessfulCharge( amount );
    }

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
        return 0;
    }
}
