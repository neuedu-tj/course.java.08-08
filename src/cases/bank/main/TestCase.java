package cases.bank.main;

import cases.bank.Facade.BankFacade;
import cases.bank.router.Biz;
import cases.bank.router.IndexDispatcher;

public class TestCase {

    public static void main(String[] args) {

        //系统级 装配
        BankFacade facade = new BankFacade();
        facade.init();

        //通过路由进入系统
        IndexDispatcher.router(Biz.LOGIN);

    }

}
