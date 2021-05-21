public class Main {
    public static void main(String[] args) {

        int startBalanceInKopecks = 100_00; //в копейках
        int refillInKopecks = 1000_00; //в копейках
        int refillClientInKopecks = 100_00; //в копейках
        int startBonus = 100_00; //в копейках
        int bonusInKopecks = 0;
        int totalBalance;

        if (refillClientInKopecks > refillInKopecks) {
            bonusInKopecks = (refillClientInKopecks / startBonus) * 100; //в копейках
            System.out.println("Вы получили " + bonusInKopecks / 100 + " бонусов");

        } else {
            System.out.println("Бонусов нет");

        }
        totalBalance = startBalanceInKopecks + refillClientInKopecks + bonusInKopecks;
        System.out.println("Вы пополнили баланс на " + refillClientInKopecks / 100 + " руб");
        System.out.println("Итоговая сумма на счете: " + totalBalance / 100 + " руб");

    }
}
