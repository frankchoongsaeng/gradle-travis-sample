package io.turntabl;

import io.turntabl.abstracts.Client;
import io.turntabl.enums.ServiceLevel;

public class CorporateClient extends Client {

    private AccountManager accountManager;

    public CorporateClient(String name, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(name, serviceLevel);
        this.accountManager = accountManager;
    }

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public String getContactName() {
        return accountManager.getName();
    }
}
