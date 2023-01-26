public class SBI implements Back{
    private  String name;
    private int accountNo;
    private int balance;
    private int Interest;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public String addMoney(int money) {
        return null;
    }

    @Override
    public int calculateIntrest(int year) {
        return 0;
    }

    @Override
    public String withDraqMoney(int money) {


    }
}
