package cases.buycart;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Data
@RequiredArgsConstructor
@ToString
public class Customer {

    @NonNull  int cid;
    @NonNull  String cname;


}
