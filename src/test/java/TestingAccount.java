import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestingAccount {

    private Account account =  new Account();


    @Test
    public void testDepositAmountToAccount(){
        int amountToDeposit = 30;
        int expectedAmountInAccount = account.getAmountInAccount() + amountToDeposit;
        account.depositAmountToAccount(amountToDeposit);
        int actualDeposit = account.getAmountInAccount();
        assertEquals(expectedAmountInAccount, actualDeposit);
    }

    @Test
    public void testWithdrawAmountFromAccount(){
        int withdraw = 30;
        account.setAmountInAccount(60);
        int expectedamount = account.getAmountInAccount()- withdraw;
        account.withdrawAmountFromAccount(withdraw);
        int actualammountinaccount = account.getAmountInAccount();
        assertEquals(expectedamount, actualammountinaccount);
    }
    @Test
    public void testExceptionWhenDeposit(){
        Throwable exception = assertThrows(InsufficientFundsException.class, () -> account.depositAmountToAccount(-10));
        assertEquals("InsufficientFundsException", exception.toString());
    }

    @Test
    public void testExceptionWhenWithDraw(){
        Throwable exception = assertThrows(InsufficientFundsException.class, () -> account.withdrawAmountFromAccount(100));
        assertEquals("InsufficientFundsException", exception.toString());
    }

}
