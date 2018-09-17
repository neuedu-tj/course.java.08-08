package cases.bank.service;

import cases.bank.handler.AccountHandler;

public class AccountService {

    AccountHandler accountHandler = new AccountHandler();

    public void save() {
        System.out.println("存钱");
    }


    public void get() {
        ////  比如 取款前  发送  sms
        accountHandler.doGet();
        /////  比如  发送日志
    }

}
