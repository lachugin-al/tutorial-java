package lessons.java101.inheritance;

public class One {

    public final String nameOne = "One";

    public static void main(String[] args) {
        final One one = new One();
        one.printOne();
        System.out.println();

        final Two two = new Two("A");
        two.printOne();
        two.printTwo();
        System.out.println();

        final Three three = new Three("B", "C");
        three.printOne();
        three.printTwo();   // @Override method
        three.printThree();
        System.out.println();

        printOneLine(one);
        printOneLine(two);
        printOneLine(three);

    }

    public void printOne() {
        System.out.println(this.nameOne);
    }

    // можем передать значение родительского класса и выше при вызове метода
    // передавать значения любого из наследуемых классов от класса One
    private static void printOneLine(final One one) {
        one.printOne();
        System.out.println("-----");
    }

}
