package cases.bank.router;

import cases.bank.service.AccountLoginService;
import cases.bank.service.IndexService;

public class IndexDispatcher {

    public static void router(String forward) {

        //spring --> 管理 bean  的生成
        AccountLoginService accountLoginService = new AccountLoginService();
        IndexService indexService = new IndexService();

        switch (forward) {

            case Biz.LOGIN:

                accountLoginService.login();

                break;

            case Biz.MAIN:

                indexService.main();

                break;

            default:
                break;
        }

    }
}
