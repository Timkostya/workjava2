public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int refill = 1100;
        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        }
        int finalScore = startingScore + refill + bonus;
        System.out.println("Бонус" + bonus);
        System.out.println("Итоговый счет" + finalScore);

    }
}