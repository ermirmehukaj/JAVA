package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        bankAccount obj1 = new bankAccount();
        obj1.setInfo("Gadir",123456789);

        System.out.println(obj1);
obj1.deposit(1000);
        obj1.checkBalance();

        obj1.withdraw(780);

        obj1.checkBalance();


        obj1.deposit(-1000);
        obj1.checkBalance();

        obj1.withdraw(5000);
        obj1.checkBalance();

        System.out.println("-----------------------");

        bankAccount account1 = new bankAccount();
        account1.setInfo("Sebastian", 764583994);
        bankAccount account2 = new bankAccount();
        account2.setInfo("Ermiri ", 1231777772);

        account1.deposit(5000);

        account1.checkBalance();
        System.out.println(account1);
        account2.deposit(10000);
        System.out.println(account2);

        account1.withdraw(1000);
        System.out.println(account1);

    }
}
