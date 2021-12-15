public class Account {
    private int amountInAccount = 0;

    public void depositAmountToAccount(int amountDeposited) {
        if (amountDeposited < 0) {
            throw new InsufficientFundsException();
        }
        amountInAccount += amountDeposited;
    }
    public void withdrawAmountFromAccount(int amountToWithdraw) {
        if (amountToWithdraw < 0) {
            throw new InsufficientFundsException();
        }
        if (amountToWithdraw > amountInAccount) {
            throw new InsufficientFundsException();
        }
            amountInAccount -= amountToWithdraw;

    }
    public int getAmountInAccount() {
        return amountInAccount;
    }

    public void setAmountInAccount(int amountInAccount) {
        this.amountInAccount = amountInAccount;
    }
}
class InsufficientFundsException extends RuntimeException {};