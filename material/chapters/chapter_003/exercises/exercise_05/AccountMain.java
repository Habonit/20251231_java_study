package chapters.chapter03.exercises.exercise_05;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.initAccount(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        account.getBalance();
    }
}
