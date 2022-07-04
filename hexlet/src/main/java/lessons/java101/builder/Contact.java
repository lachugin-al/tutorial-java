package lessons.java101.builder;

public class Contact {

    private final String name;
    private final String surname;
    private final int phone;

    // когда у модели касса есть билдер, то конструктор должен быть недоступен никому кроме самого билдера
    // можем сделать его package local (default)
    /*public Contact(final String name, final String surname, final int phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }*/

    // создаем конструкто который вызывает конструктор билдера
    Contact(final ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.phone = contactBuilder.getPhone();
    }

    // создаем ссылку на новый ContactBuilder и вызываем его методы
    public static void main(String[] args) {
        final Contact contact = new ContactBuilder()
                .name("name")
                .surname("surname")
                .phone(123)
                .build();
    }

}
