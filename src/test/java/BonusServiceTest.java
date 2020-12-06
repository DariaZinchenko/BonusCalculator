import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredUnderlimit() {
        BonusService service = new BonusService();

        long amount = 10_000_00;
        boolean isRegistered = true;
        long expected = 3_00;

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredEquallimit() {
        BonusService service = new BonusService();

        long amount = 1_666_666_67;
        boolean isRegistered = true;
        long expected = 500_00;

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredOverlimit() {
        BonusService service = new BonusService();

        long amount = 3_000_000_00;
        boolean isRegistered = true;
        long expected = 500_00;

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredUnderlimit() {
        BonusService service = new BonusService();

        long amount = 10_000_00;
        boolean isRegistered = false;
        long expected = 1_00;

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredEquallimit() {
        BonusService service = new BonusService();

        long amount = 5_000_000_00;
        boolean isRegistered = false;
        long expected = 500_00;

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredOverlimit() {
        BonusService service = new BonusService();

        long amount = 10_000_000_00;
        boolean isRegistered = false;
        long expected = 500_00;

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }


}