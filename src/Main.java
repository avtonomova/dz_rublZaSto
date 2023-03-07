public class Main {
    public static void main(String[] args) {
        int start = 200;
        int sum = 10000;
        int total = start + sum;

        int bonus;
        if (sum >= 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Количетсво бонусов " + bonus);
        System.out.println("Баланс " + total);

    }

}