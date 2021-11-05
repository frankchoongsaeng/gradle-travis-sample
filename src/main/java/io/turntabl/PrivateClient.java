package io.turntabl;

import io.turntabl.abstracts.Client;
import io.turntabl.enums.ServiceLevel;

public class PrivateClient extends Client {

    public PrivateClient(String name, ServiceLevel serviceLevel) {
        super(name, serviceLevel);
    }

    @Override
    public String getContactName() {
        return super.name;
    }
}
