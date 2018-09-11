package cases.buycart;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
@RequiredArgsConstructor
public class BuyItem {

    @NonNull Product product;
    @NonNull int amount;
    Map<String , String>  detail;  //品类


    @Override
    public boolean equals(Object o) {
        BuyItem item1 = this;
        BuyItem item2 = (BuyItem)o;

        if(item1.getProduct().getId() == item2.getProduct().getId()) return true;
        else return false;

    }


}
