package cases.bank.service;

import cases.bank.handler.AccountLoginHandler;
import cases.bank.model.Account;
import cases.bank.router.Biz;
import cases.bank.router.IndexDispatcher;

public class AccountLoginService {


    AccountLoginHandler handler = new AccountLoginHandler();

    public void login() {

        int count = 0;
        Account account = handler.check();

        if(account == null ) {
            count++;
            if(count>=3) {
                System.out.println("三次了      你是骗子吧 .....");
//                return;
                System.exit(0);
            } else {
                login();
            }

        } else {
            System.out.println("登录成功");

            IndexDispatcher.router(Biz.MAIN);

        }


    }


}
