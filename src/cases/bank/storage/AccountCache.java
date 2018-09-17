package cases.bank.storage;

import cases.bank.model.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {

    private  static AccountCache accountCache = new AccountCache();

    private Map<String , Account> accountMap = new HashMap<String,Account>();
    private Account logged ;






    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<String, Account> accountMap) {
        this.accountMap = accountMap;
    }

    private AccountCache() {}

    public static AccountCache getInstance() {
        return accountCache;
    }


}
