package model;

import command.IOperation;

import java.math.BigDecimal;

public class DepositImpl implements IOperation {
    private Account account;
    private BigDecimal amount;

    public DepositImpl(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(this.amount);
    }
}
