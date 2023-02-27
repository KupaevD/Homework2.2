public class Main {
    public static void main(String[] args) {

        int amountOnTheAccount = 100;
        int amount = 1130;
        int bonus;
        if (amount > 1_000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = amountOnTheAccount + amount + bonus;

        System.out.println("Итоговая сумма на счету " + totalAmount);
    }
}