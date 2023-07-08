package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    private String uuid;
    private BigDecimal balance;

    public void withdraw(BigDecimal amount) {
        this.balance = balance.subtract(amount);
        System.out.println("Balance withdraw " + this.balance);
    }

    public void deposit(BigDecimal amount) {
        this.balance = balance.add(amount);
        System.out.println("Balance deposit " + this.balance);
    }

    public String getAmount() {
        return this.balance.toString();
    }

}
