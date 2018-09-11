package collection.support;

import lombok.Data;

import java.util.StringJoiner;

@Data
public class Product {

    int id;
    String name;
    int amount;
    double price;

    public Product(int id, String name, int amount, double price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("amount=" + amount)
                .add("price=" + price)
                .toString();
    }
}
