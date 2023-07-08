import invoker.Invoker;
import model.Account;
import model.DepositImpl;
import model.WithdrawImpl;

import java.math.BigDecimal;

public class Bank {

    public static void main(String[] args) {

        Account account = new Account("49637021-15ed-472a-bc72-cf3e818b0029",
                new BigDecimal("100.000"));

        var deposit = new DepositImpl(account, new BigDecimal("40.00"));
        var withdraw = new WithdrawImpl(account, new BigDecimal("30.00"));
        //add the desired operation or commands to the list

        var invoker = new Invoker();
        System.out.println("initial amount " + account.getAmount());
        invoker.getOperations(deposit);
        invoker.getOperations(withdraw);
        invoker.runOperations();

    }
}
