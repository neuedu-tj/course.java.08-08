package cases.buycart;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@ToString
public class Product {

    @NonNull  int id;
    @NonNull  String pname;
    @NonNull  BigDecimal price;

}
