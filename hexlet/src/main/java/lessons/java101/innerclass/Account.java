package lessons.java101.innerclass;

public class Account {

    private double amount = 10000;
    private final String number; // final так как создается 1 раз и не меняется
    private final String owner;
    public Account(final String number, final String owner) {
        this.number = number;
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    private synchronized double withdraw(final double amountToWithdraw) {
        if (amountToWithdraw > getAmount()) {
            final double amountToReturn = getAmount();
            this.amount = 0;
            return amountToReturn;
        }
        if (amountToWithdraw < 0) return .0;
        this.amount = this.amount - amountToWithdraw;
        return amountToWithdraw;
    }

    // вложенный inner класс всегда имеет референс(ссылку) на инстанс родителя
    // нет необходимость создавать инстанс Account в классе Card
    // inner non-static class используется для явной связи с родительским классом
    public class Card {

        private final String number;

        public Card(final String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public double withdraw(final double amountTowithdraw) {
            return Account.this.withdraw(amountTowithdraw);
        }
    }

}
