// T - обобщенный тип
public interface INode<T> {

    /*
    У Node всегда есть 2 предка (слева меньше (или null), справа больше (или null))
     */

    // Возвращает НОВУЮ Node
    public INode add(final T value);

    public void print();

    public int count();

    public void forEach(final IConsumer<T> consumer);

    public interface IConsumer<R> {

        public void consume(final R value);
    }

}
