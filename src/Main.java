public class Main {
    public static void main(String[] args) {

        int startBalanceInKopecks = 100_00; //в копейках
        int refillInKopecks = 1000_00; //в копейках
        int refillClientInKopecks = 1100_00; //в копейках
        int startBonus = 100_00; //в копейках
        int bonusInKopecks;
        int totalBalance;

        if (refillClientInKopecks > refillInKopecks) {
            bonusInKopecks = (refillClientInKopecks / startBonus) * 100; //в копейках
            totalBalance = startBalanceInKopecks + refillClientInKopecks + bonusInKopecks;
            System.out.println("Вы пополнили баланс на " + refillClientInKopecks / 100 + " руб и получили " + bonusInKopecks / 100 + " бонусов");
            System.out.println("Итоговая сумма на счете: " + totalBalance / 100);
        } else {
            totalBalance = startBalanceInKopecks + refillClientInKopecks;
            System.out.println("Вы пополнили баланс на " + refillClientInKopecks / 100 + " руб. Бонусов нет");
            System.out.println("Итоговая сумма на счете: " + totalBalance / 100);
        }

    }
}
