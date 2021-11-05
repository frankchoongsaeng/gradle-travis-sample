package io.turntabl;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountManagerTest {

    @Test // test that a name is gotten when getName is called
    public void testGetName() {
        AccountManager am = new AccountManager("Micheal");
        assertEquals(am.getName(), "Micheal");
    }
}