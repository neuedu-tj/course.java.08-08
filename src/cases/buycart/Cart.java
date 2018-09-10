package cases.buycart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<BuyItem> items = new ArrayList();


    public void addItems(BuyItem item) {


        if(items.contains(item)) {

            for (BuyItem i : items  ) {
                if(i.equals(item)) {
                    i.setAmount( i.getAmount() + item.getAmount());
                }
            }

        } else {
            items.add(item);
        }


    }

    public void detail() {

        for (BuyItem item : items) {
            System.out.println("name : " + item.getProduct().getPname() +" , amount : " + item.getAmount());
        }

    }



}
