import ru.netology.bonus.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_00;
        boolean isRegistered = true;
        long expected = 30;

        long actual = service.calculate(amount, isRegistered);

        boolean passed = expected == actual;

        System.out.println(passed);
    }
}
