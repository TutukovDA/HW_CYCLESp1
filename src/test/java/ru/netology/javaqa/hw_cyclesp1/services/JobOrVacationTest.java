package ru.netology.javaqa.hw_cyclesp1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JobOrVacationTest {
    @Test
    public void JobORVacationTest() {
        JobOrVacation count = new JobOrVacation();
        int expected = 2;
        int actual = count.countVacationMonth(0, 100000, 60000, 150000);
        Assertions.assertEquals(expected,actual);
        System.out.println("Фрилансер может отдыхать " + actual + " месяцев/ца");
    }
    @Test
    public void JobORVacationTest2() {
        JobOrVacation count = new JobOrVacation();
        int expected = 3;
        int actual = count.countVacationMonth(0, 10000, 3000, 20000);
        Assertions.assertEquals(expected,actual);
        System.out.println("Фрилансер может отдыхать " + actual + " месяцев/ца");
    }
}
