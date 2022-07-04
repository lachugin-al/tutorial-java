package collections;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.Collection;

public class CollectionBenchmarkTest {
    /**
     * JMH Framework для нагрузочного тестирования и вычисления производительности методов
     */
    private static final int ELEMENTS_AMOUNT = 10_000;

    @Benchmark
    public void testArrayListAddMethod() {
        final Collection<Integer> integerCollection = new ArrayCollection<>();

        for (int i = 0; ++i < ELEMENTS_AMOUNT; )
            integerCollection.add(i);
    }

    @Benchmark
    public void testArrayListRemoveMethodFromStart() {
        final Integer[] m = new Integer[ELEMENTS_AMOUNT];

        for (int i = 0; ++i < ELEMENTS_AMOUNT; ) m[i] = i;

        final Collection<Integer> integerCollection = new ArrayCollection<>(m);
        for (int i = 0; i < ELEMENTS_AMOUNT; i--) {
            integerCollection.remove(i);
        }
    }

    @Benchmark
    public void testArrayListRemoveMethodFromEnd() {
        final Integer[] m = new Integer[ELEMENTS_AMOUNT];

        for (int i = 0; i < ELEMENTS_AMOUNT; i++) {
            m[i] = i;
        }

        final Collection<Integer> integerCollection = new ArrayCollection<>(m);
        for (int i = ELEMENTS_AMOUNT; i >= 0; i--) {
            integerCollection.remove(i);
        }
    }
}

/**
 * mvn clean install
 * java -jar target/*.jar
 */