package collections;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCollectionTest {

    @Test
    public void testSizeWhenSizeIs0() throws Exception {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        assertEquals(0, testInstance.size());
    }

    @Test
    public void testSizeWhenSizeIsEmpty() throws Exception {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        assertTrue(testInstance.isEmpty());
    }

    @Test
    public void testContains() throws Exception {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        assertTrue(testInstance.contains(1));
        assertFalse(testInstance.contains(0));
    }

    @Test
    public void testContainsAll() throws Exception {
        final Collection<Integer> testInstance1 = new ArrayCollection<>();
        final Collection<Integer> testInstance2 = new ArrayCollection<>();
        testInstance1.add(1);
        testInstance1.add(2);
        testInstance2.add(1);
        testInstance2.add(2);

        assertTrue(testInstance1.containsAll(testInstance2));
    }

    @Test
    public void testContainsOnNull() {
        final Collection<Object> testInstance = new ArrayCollection<>();
        testInstance.add(1);
        testInstance.add(null);
        testInstance.add("1");

        assertTrue(testInstance.contains(1));
        assertTrue(testInstance.contains(null));
        assertTrue(testInstance.contains("1"));
        assertFalse(testInstance.contains("2"));
    }

    /*@Test
    public void testToArrayWhenInputArrayHaveSizeOne()  {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add(3);

        final Integer[] input = new Integer[1];

        final Integer[] result = testInstance.toArray(input);

        assertNotEquals(input, result);
        assertEquals((Integer)1, result[0]);
        assertEquals((Integer)2, result[1]);
        assertEquals((Integer)3, result[2]);
        assertEquals(3, result.length);
    }*/

    @Test
    public void testToArrayWhenInputArrayHaveCorrectSize() {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add(3);

        final Integer[] input = new Integer[3];

        final Integer[] result = testInstance.toArray(input);
        assertArrayEquals(input, result);
    }

    @Test
    public void testAdd() throws Exception {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        testInstance.add(1);
        testInstance.add(1);

        /*for (Integer test : testInstance) {
            System.out.println(test);
        }*/

        assertEquals(2, testInstance.size());
        assertFalse(testInstance.isEmpty());
    }

    @Test
    public void testAddAll() throws Exception {
        final Collection<Integer> testInstance1 = new ArrayCollection<>();
        testInstance1.add(1);
        testInstance1.add(2);

        final Collection<Integer> testInstance2 = new ArrayCollection<>();
        testInstance2.addAll(testInstance1);

        assertTrue(testInstance2.contains(1));
        assertTrue(testInstance2.contains(2));
    }

    @Test
    public void testRemove() throws Exception {
        final Collection<String> testInstance = new ArrayCollection<>();
        testInstance.add("1");
        testInstance.add("2");

        try {
            testInstance.remove("1");
        } catch (final NullPointerException e) {
            throw new RuntimeException("now value on index", e);
        } catch (final IndexOutOfBoundsException e) {
        }

        assertFalse(testInstance.contains("1"));
    }

    @Test
    public void testRemoveAll() throws Exception {
        final Collection<Integer> testInstance1 = new ArrayCollection<>();
        testInstance1.add(1);
        testInstance1.add(2);

        final Collection<Integer> testInstance2 = new ArrayCollection<>();
        testInstance2.addAll(testInstance1);
        testInstance2.add(3);

        testInstance2.removeAll(testInstance1);

        assertEquals(1, testInstance2.size());
        assertTrue(testInstance2.contains(3));
        assertFalse(testInstance2.contains(1) || testInstance2.contains(2));
    }


    @Test
    public void testRemoveFirstElement() throws Exception {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.remove(1);

        assertEquals(1, testInstance.size());
        assertFalse(testInstance.isEmpty());
    }

    @Test
    public void testRemoveLastElement() throws Exception {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add(3);
        testInstance.remove(2);
        testInstance.remove(1);

        assertEquals(1, testInstance.size());
        assertTrue(testInstance.contains(3));
    }

    @Test
    public void testClear() throws Exception {
        final Collection<Integer> testInstance = new ArrayCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        testInstance.clear();

        assertEquals(0, testInstance.size());
        assertTrue(testInstance.isEmpty());
    }

}