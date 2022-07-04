package lessons.java101.exceptions;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.makeMove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void move(int x, int y) throws InvalidCoordinateException, FieldNotEmptyException {
        if (x != y) {
            throw new InvalidCoordinateException(); // создаем обьект эксепшена
        } else {
            throw new FieldNotEmptyException();     // создаем обьект эксепшена
        }
    }

    public void makeMove() throws Exception { // на уровне выше должен быть трай-кертч при trows в методе
        final int x = 1;
        final int y = 2;
        move(x, y);
//         при public void makeMove() без троус {
//        try {
//           move(x, y);  // при вызове метода необходимо указать в трай-кэтч что делать при том или ином эксепшене указанном в методе
//        } catch (final FieldNotEmptyException | InvalidCoordinateException e) {
//            e.printStackTrace();
//        }
    }

    // try/catch Error
    public void throwError() {
        throw new OutOfMemoryError(); // OutOfMemoryError наследуется от VirtualMachineError далее от Error
    }
    void catchError() {
        try {
            throwError();
        } catch (Error e){} // OutOfMemoryError
    }

    // RuntimeException(unchecked) без try/catch (можем использовать для сотронних библиотек)
    // так же, когда мы не знаем как разруливать кэтч
    void throwRuntimeException() {
        throw new RuntimeException();
    }
    void catchRuntimeException() {
        throwRuntimeException();
    }

    void trowsNullPointerException() {
        String s = null;
        s.length();
        throw new NullPointerException();
    }
    void catchNullPointerException() {
        throwRuntimeException();
    }

}
