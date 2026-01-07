package chapters.chapter03.exercises.exercise_05;

public class Account {
    int balance;

    void initAccount(int balance) {
        this.balance = balance;
        System.out.println("초기 잔액: " + this.balance);
    }

    void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("입금 금액은 0보다 크야아 합니다.");
        }
        else { 
            this.balance += amount;
            System.out.println("입금 후 잔액: " + this.balance);
        }
    }
    
    void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("출금 금액은 0보다 크야아 합니다.");
        }
        else if (amount > this.balance) {
            System.out.println("잔액이 부족합니다.");
        }
        else {
            this.balance -= amount;
            System.out.println("출금 후 잔액: " + this.balance);
        }
    }
    void getBalance() {
        System.out.println("현재 잔액: " + this.balance);
    }
}
