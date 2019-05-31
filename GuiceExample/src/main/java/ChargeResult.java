public class ChargeResult extends Receipt {
    boolean success = false;
    public ChargeResult(boolean b) {
        this.success = b;
    }

    boolean wasSuccessful() {
        return true;
    }

    public String getDeclineMessage() {
        return "not successful";
    }
}
