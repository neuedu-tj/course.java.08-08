package cases.bank.router;

import cases.bank.service.AccountLoginService;
import cases.bank.service.IndexService;

public class IndexRouters {

    static AccountLoginService accountLoginService = new AccountLoginService();
    static IndexService indexService = new IndexService();

    public static void router(String forward) {

        switch (forward) {

            case Biz.LOGIN:

                accountLoginService.login();

                break;

            case Biz.BIZ:

                indexService.main();

                break;

            default:
                break;
        }

    }
}
