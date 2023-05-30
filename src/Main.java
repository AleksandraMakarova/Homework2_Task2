public class Main {
    public static void main(String[] args) {
        int account = 100;
        int totalAccount;
        int bonus;
        int deposit = 1100;
        if (deposit >= 1000) {
            bonus = deposit / 100;
            totalAccount = account + deposit + bonus;
        } else {
            bonus = 0;
            totalAccount = account + deposit;
        }

        System.out.println(totalAccount);
        System.out.println(bonus);




    }
}
