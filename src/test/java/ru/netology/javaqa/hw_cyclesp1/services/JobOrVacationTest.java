package ru.netology.javaqa.hw_cyclesp1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class JobOrVacationTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resourses/data")
    public void JobORVacationTest(int expected, int deposit, int income, int expenses, int threshold) {
        JobOrVacation count = new JobOrVacation();
        int actual = count.countVacationMonth(deposit,income,expenses,threshold);
        Assertions.assertEquals(expected,actual);
        System.out.println("Фрилансер может отдыхать " + actual + " месяцев/ца");
    }
}
