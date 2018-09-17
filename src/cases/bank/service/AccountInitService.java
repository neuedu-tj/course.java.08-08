package cases.bank.service;

import cases.bank.storage.AccountCache;

import java.util.HashMap;

public class AccountInitService {


    //加载记事本中的用户数据
    public void initAccount() {
        System.out.println("初始化加载用户数据");
        AccountCache.getInstance().setAccountMap(new HashMap<>());
    }


    //list --- >  txt
    public void exportDataToTxt() {
        System.out.println("将数据  导出到  txt .");
    }

}
