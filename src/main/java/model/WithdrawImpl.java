package model;

import command.IOperation;

import java.math.BigDecimal;

public class WithdrawImpl implements IOperation {

    private Account account;
    private BigDecimal amount;

    public WithdrawImpl(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void execute() {
        account.withdraw(this.amount);
    }
}
