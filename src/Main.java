public class Main {
    public static void main(String[] args) {
        int enrollment = 900;
        int balance = 800 + enrollment;
        int bonus = 0;
        if (enrollment > 100) {
            bonus = enrollment / 100;
        }
        System.out.println("Ваш баланс" + balance + "начисленно бонусов" + bonus);
    }
}
