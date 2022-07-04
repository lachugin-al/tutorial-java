public class NodeMutable implements INode<Integer> {

    private final int value;

    private INode left = null;

    private INode right = null;

    public NodeMutable(final int value) {
        this.value = value;
    }


    /*
    Добавляем Ноду через конструктор
     */
    @Override
    public INode add(final Integer value) {
        if (value == this.value) return this; // если значение одинаковое то его же и возвращаем
        if (value < this.value) { // если значение меньше чем у текущей Ноды
            if (left == null)   // если = null то создаем новую Ноду
                // проблемма в том что могут сюда зайти 2 потока и может потеряться одно из значений
                left = new NodeMutable(value);
            else
                left = left.add(value); // вызываем у левого предка метод add который проверяет тоже самое пока не найдет в итоге null для записи
            return this;
        }
        if (right == null)
            // проблемма в том что могут сюда зайти 2 потока и может потеряться одно из значений
            right = new NodeMutable(value);
        else
            right = right.add(value);
        return this;
    }

    // Выведет на экран отсортированные элементы
    @Override
    public void print() {
        if (left != null) left.print(); // рекурсивно вызываем метод print()
        System.out.println(value);
        if (right != null) right.print();
    }

    @Override
    public int count() {
        int leftCount = left != null ? left.count() : 0; // если левая Нода не null мы запрашиваем у нее count() иначе ставим 0
        int rigthCount = right != null ? right.count() : 0;
        return leftCount + 1 + rigthCount;
    }

    @Override
    public void forEach(IConsumer<Integer> consumer) {

    }
}
