package lessons.java101.enumerator;

public enum Figure {

    X1, O1,   // список возможных инстансов данного энумероватора, других создать невозможно
    X2("X"), O2("O");       // при оспользовании кастомного конструктора

    private final String figure;

    // дефолтный кастомный конструктор
    Figure() {
        this.figure = null;
    }

    // кастомный конструктор
    Figure(final String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    // если необходимо вывести значения, то можем переписать метод toString
    // и выводит null, null, X, O
    @Override
    public String toString() {return this.figure;}

    // если нет toString то java сама создает toString для энумератора который превращает наименование инстанса в стрингу
    // и выводит X1, O1, X2, O2

}
