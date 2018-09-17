package cases.bank.Facade;

import cases.bank.service.AccountInitService;

public class BankFacade {

    private AccountInitService initService ;

    public BankFacade() {
        this.initService = new AccountInitService();
    }


    public void init() {
        initService.initAccount();
    }
}
