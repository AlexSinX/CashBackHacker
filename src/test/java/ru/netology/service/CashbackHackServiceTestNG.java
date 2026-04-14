package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldReturn100For900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected, "При сумме 900 должно быть 100");
    }

    @Test
    public void shouldReturn0For1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        // Этот тест упадёт, потому что actual = 1000, а expected = 0
        Assert.assertEquals(actual, expected, "При сумме 1000 должно быть 0");
    }

    @Test
    public void shouldReturn500For500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
}