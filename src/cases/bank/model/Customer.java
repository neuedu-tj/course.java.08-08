package cases.bank.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Customer {

    String name;
    int age;
    String tel;

    public Customer(String name, int age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public Customer(String name) {
        this.name = name;
    }
}
