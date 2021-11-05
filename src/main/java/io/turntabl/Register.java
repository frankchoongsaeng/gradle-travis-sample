package io.turntabl;

import io.turntabl.abstracts.Client;

import java.util.Arrays;
import java.util.HashMap;

public class Register {
    private HashMap<Integer, Client> clientRegister;

    public Register() {
        clientRegister = new HashMap<>();
    }

    public void add(Client... client) {
        Arrays.stream(client).forEach(c -> clientRegister.put(c.getId(), c));
    }
}