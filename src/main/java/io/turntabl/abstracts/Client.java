package io.turntabl.abstracts;

import io.turntabl.enums.ServiceLevel;

public abstract class Client {
    protected String name;
    private int id;
    private String stringId;
    private ServiceLevel serviceLevel;
    private static int counter = 0;

    public Client(String name, ServiceLevel serviceLevel) {
        id = generateId();
        stringId = generateId().toString();
        this.name = name;
        this.serviceLevel = serviceLevel;
    }

    private Integer generateId() {
        return counter++;
    }

    public int getId() {
        return id;
    }

    public abstract String getContactName();
}
