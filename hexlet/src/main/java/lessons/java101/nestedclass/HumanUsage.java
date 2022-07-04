package lessons.java101.nestedclass;

public class HumanUsage {

    public static void main(String[] args) {
        final Human human = new Human(); // создаем объект класса Human
        // обращаемся к Relations без создание инстанса Relations так как статический класс в классе
        human.relations = new Human.Relations("married"); // создаем в объекте класса по ссылке через конструктор объект класса Relations
        human.relations.getSurname();
    }
}
