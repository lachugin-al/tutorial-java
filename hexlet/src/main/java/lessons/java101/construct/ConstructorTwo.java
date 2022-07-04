package lessons.java101.construct;

public class ConstructorTwo extends ConstructorOne {

    private final String two;

    public ConstructorTwo(final ConstructorOne constructorOne, final String two) {
        super();        // вызывает пустой конструктор из верхнего класса
        this.two = two;
    }

    @Override
    public void getConsInfo() {
        System.out.println(this.two);
    }

}
