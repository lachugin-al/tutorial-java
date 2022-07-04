package lessons.java101.builder;

public class ContactBuilder {

    private String name;
    private String surname;
    private int phone;

    // создаем конструктор для возврата инстанса ContactBuilder и мутируем поле name, на вход принимаем новое значение поля name
    // в поле текущего класса записывает новое значение данного поля name и возвращает ссылку
    // на текущий билдер ContactBuilder в оперативной памяти
    public ContactBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder surname(final String surname) {
        this.surname = surname;
        return this;
    }

    public ContactBuilder phone(final int phone) {
        this.phone = phone;
        return this;
    }

    // после нам необходим геттер
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhone() {
        return phone;
    }

    // необходим метод билдера который будет возвращать инстанс Contact в конструктор которого передает себя
    public Contact build() {
        return new Contact(this);
    }

}
