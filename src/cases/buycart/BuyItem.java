package cases.buycart;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class BuyItem {

    @NonNull Product product;
    @NonNull int amount;


    @Override
    public boolean equals(Object o) {
        BuyItem item1 = this;
        BuyItem item2 = (BuyItem)o;

        if(item1.getProduct().getId() == item2.getProduct().getId()) return true;
        else return false;

    }


}
