package lessons.java101.construct;

public class ConstructorThree extends ConstructorTwo {

    public ConstructorThree(final ConstructorOne constructorOne, String two) {
        super(constructorOne, two);
    }

    public static void main(String[] args) {
//        ConstructorThree constructorThree = new ConstructorThree();   // не создаст так как наследуется от ConstructorTwo
//        это означает что при создании ConstructorThree мы должны пойти в ConstructorTwo и вызвать тот конструктор который принимает на вход
//        (ConstructorOne constructorOne, String two)

        ConstructorTwo constructorTwo = new ConstructorThree(new ConstructorOne("One"), "Two");
//         создает конструктор перемещаясь по super() на более верхний уровень

    }

}
