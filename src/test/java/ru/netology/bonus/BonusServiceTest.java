package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @ParameterizedTest(name = "{index} {0}")
    @CsvFileSource(resources = {"/data.csv"}, delimiter = ',')
    void shouldCalculateBonusTest(String testName, long amount, boolean isRegistered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }
}