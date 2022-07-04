package collections;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayCollection<T> implements Collection<T> {

    private List<String> stringList = new ArrayList<>();

    private T[] m = (T[]) new Object[0];
    private int size;

    public ArrayCollection() {
    }

    public ArrayCollection(final T[] m) {
        this.m = m;
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(final Object o) {
        for (int i = 0; i < size; i++) {
            if (m[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ElementsIterator();
    }

    @Override
    public Object[] toArray() {
        final T[] newM = (T[]) new Object[this.size()];
        System.arraycopy(m, 0, newM, 0, this.size());

        return newM;
    }

    @Override
    public <T1> T1[] toArray(final T1[] a) {
        if (a.length >= size()) {
            System.arraycopy(m, 0, a, 0, size());
            return a;
        } else {
            return (T1[]) Arrays.copyOf(this.m, this.size());
        }
    }

    @Override
    public boolean add(final T t) {
        if (m.length == this.size()) {
            this.m = Arrays.copyOf(m, m.length + 1);
        }
        this.m[size++] = t;
        return true;
    }

    @Override
    public boolean remove(final Object o) {
        for (int i = 0; i < size(); i++) {
            if (m[i].equals(o) && i != this.size() - 1) {
                System.arraycopy(m, i + 1, m, i, this.size() - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        for (final Object item : c) {
            if (!this.contains(item)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(final Collection<? extends T> c) {
        for (final T item : c) {
            this.add(item);
        }
        return true;
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        for (final Object item : c) {
            this.remove(item);
        }
        return true;
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        for (final Object item : c) {
            if (!c.contains(item)) this.remove(item);
        }
        return true;
    }

    @Override
    public void clear() {
        m = (T[])new Object[1];
        this.size = 0;

    }

    private class ElementsIterator implements Iterator<T> {

        private int size;

        @Override
        public boolean hasNext() {
            return ArrayCollection.this.size() > size;
        }

        @Override
        public T next() {
            return ArrayCollection.this.m[size++];
        }
    }
}
