package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceJUnit4 {

    @Test
    public void shouldReturn100For900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual); // JUnit4: expected, actual
    }

    @Test
    public void shouldReturn0For1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        // Упадёт: actual = 1000
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500For500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(expected, actual);
    }
}