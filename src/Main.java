public class Main {
    public static void main(String[] args) {

        int balance = 800;
        int enrollment = 900;
        
        int bonus = 0;
        if (enrollment > 100) {
            bonus = enrollment / 100;
        }
        int result = balance + enrollment;


        System.out.println("Ваш баланс" + result + "начисленно бонусов" + bonus);
    }
}
