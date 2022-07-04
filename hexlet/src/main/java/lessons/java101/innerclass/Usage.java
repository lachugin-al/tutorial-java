package lessons.java101.innerclass;

public class Usage {

    public static void main(String[] args) {
        final Account myAccount = new Account("123", "A");
        // final Account.Card myCard = new Account.Card("123");
        final Account.Card myCard = myAccount.new Card("12345");
        // выводим значение из Account
        System.out.println(myAccount.getAmount());
        // используем метод из Card
        myCard.withdraw(-1000);
        // меняется значение в Account, выводим в консоль
        System.out.println(myAccount.getAmount());
    }

}
