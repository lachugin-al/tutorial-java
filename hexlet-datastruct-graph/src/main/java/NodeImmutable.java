public class NodeImmutable implements INode<Integer> {
// Нода запрещает изменения

    private final int value;

    private final INode left;

    private final INode right;

    public NodeImmutable(int value, INode left, INode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // Потокобезопасный подход
    @Override
    public INode add(Integer value) {
        if (value == this.value) return this;
        if (value < this.value) {
            if (left == null)
                return new NodeImmutable(this.value,
                        new NodeImmutable(value, null, null),
                        right);
            return new NodeImmutable(this.value, left.add(value), right);
        }
        if (right == null)
            return new NodeImmutable(this.value,
                    left,
                    new NodeImmutable(value, null, null));
        return new NodeImmutable(this.value, left, right.add(value));
    }

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
        if (left != null) left.forEach(consumer); // пробежаться по левому дереву и передать все элементы в consume
        consumer.consume(value);
        if (right != null) right.forEach(consumer);
    }
}
