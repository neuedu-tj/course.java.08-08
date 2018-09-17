package cases.bank.handler;

import cases.bank.model.Account;
import cases.bank.model.Customer;
import cases.bank.storage.AccountCache;

public class AccountLoginHandler {

    public Account check() {
        System.out.println("校验");

//        从已加载的客户容器中寻找  要校验的人

        return new Account(new Customer("tom"),  "1001" , "123");   //如果找不到 返回为 null /.      list.get()
    }
}
