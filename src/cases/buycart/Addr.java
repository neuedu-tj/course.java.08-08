package cases.buycart;


import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@ToString
public class Addr {

    @NonNull int aid;
    @NonNull boolean isDefault;
    @NonNull  String aname;
    @NonNull String detail;
    @NonNull String tel;


}
