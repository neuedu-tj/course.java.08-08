package cases.bank.model;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Account {

    Customer customer;

    String card;
    String pwd;

    BigDecimal balance;

    public Account(Customer customer, String card, String pwd, BigDecimal balance) {
        this.customer = customer;
        this.card = card;
        this.pwd = pwd;
        this.balance = balance;
    }

    public Account(Customer customer, String card, String pwd) {
        this.customer = customer;
        this.card = card;
        this.pwd = pwd;
    }
}
