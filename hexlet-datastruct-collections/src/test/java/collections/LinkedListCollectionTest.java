package collections;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCollectionTest {

    @Test
    public void addAllTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < 3; i++) {
            set.add(i * 100);
        }
        list.addAll(set);

        int[] arr = new int[]{0, 1, 2, 3, 100, 200};
        int i = 5;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void addAllTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();

        list.addAll(set);

        int[] arr = new int[]{0, 1, 2, 3};
        int i = 3;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void addAllWithIndexTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < 4; i++) {
            set.add(i * 100);
        }

        list.addAll(0, set);

        int[] arr = new int[]{100, 200, 300, 0, 1, 2, 3};
        int i = 6;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void addAllWithIndexTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < 4; i++) {
            set.add(i * 100);
        }

        list.addAll(2, set);

        int[] arr = new int[]{0, 1, 100, 200, 300, 2, 3};
        int i = 6;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void addFirstTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();

        for (int i = 0; i < 4; i++) {
            list.addFirst(i);
        }

        int i = 0;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(i, (int) iterator.previous());
            i++;
        }
    }

    @Test
    public void addFirstTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        list.addFirst(1);
        list.addFirst(null);
        list.addFirst(3);

        assertEquals(3, (int) list.get(0));
        assertNull(list.get(1));
        assertEquals(1, (int) list.get(2));

    }

    @Test
    public void addLastTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        int i = 3;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(i, (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void addLastTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        list.add(1);
        list.add(null);
        list.add(3);

        assertEquals(1, (int) list.get(0));
        assertNull(list.get(1));
        assertEquals(3, (int) list.get(2));
    }

    @Test
    public void addWithIndexTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.add(0, 100);

        int[] arr = new int[]{100, 0, 1, 2, 3};
        int i = 4;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void addWithIndexTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.add(list.size(), 100);

        int[] arr = new int[]{0, 1, 2, 3, 100};
        int i = 4;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void addWithIndexTest3() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.add(2, 100);

        int[] arr = new int[]{0, 1, 100, 2, 3};
        int i = 4;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void clearTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.clear();
        assertEquals(0, list.size());

    }

    @Test
    public void clearTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();

        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void listItrTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }

        int[] arr = new int[]{1, 2, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void listItrTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }

        int[] arr = new int[]{1, 2, 3};
        int i = 0;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasNext()) {
            assertEquals(arr[i], (int) iterator.next());
            i++;
        }
    }

    @Test
    public void ListItrTest3() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }

        ListIterator<Integer> iterator = list.listIterator(0);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        assertEquals(0, list.size());
    }

    @Test
    public void ListItrTest4() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }

        int i = 1;
        ListIterator<Integer> iterator = list.listIterator(0);
        while (iterator.hasNext()) {
            iterator.next();
            assertEquals(i, iterator.nextIndex());
            i++;
        }
    }

    @Test
    public void ListItrTest5() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }

        int i = 0;
        ListIterator<Integer> iterator = list.listIterator(0);
        while (iterator.hasNext()) {
            iterator.next();
            assertEquals(i, iterator.previousIndex());
            i++;
        }
    }

    @Test
    public void ListItrTest6() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        ListIterator<Integer> iterator = list.listIterator(0);

        iterator.next();
        iterator.add(100);

        int[] arr = new int[]{0, 100, 1, 2, 3};
        int i = 0;
        iterator = list.listIterator(0);
        while (iterator.hasNext()) {
            assertEquals(arr[i], (int) iterator.next());
            i++;
        }
    }

    @Test
    public void ListItrTest7() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }

        int[] arr = new int[]{100, 200, 300};
        int i = 1;
        ListIterator<Integer> iterator = list.listIterator(0);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.set(i * 100);
        }

        i = 0;
        iterator = list.listIterator(0);
        while (iterator.hasNext()) {
            assertEquals(arr[i], (int) iterator.next());
        }
    }

    @Test
    public void removeAllTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < 3; i++) {
            set.add(i);
        }

        list.removeAll(set);

        int[] arr = new int[]{0, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void removeAllTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);

        list.removeAll(set);

        int[] arr = new int[]{0, 1, 2, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void removeAllTest3() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(300);

        list.myRemoveAll(set);

        int[] arr = new int[]{0, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
            i--;
        }
    }

    @Test
    public void removeAllTest4() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        list.add(2);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        list.myRemoveAll(set);
        assertEquals(0, list.size());
    }

    @Test
    public void removeByIndexTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.remove(0);

        int[] arr = new int[]{1, 2, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void removeByIndexTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        list.remove(list.size() - 1);

        int[] arr = new int[]{0, 1, 2, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void removeByIndexTest3() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.remove(2);

        int[] arr = new int[]{0, 1, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void removeByValueTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Object o = 0;
        list.remove(o);

        int[] arr = new int[]{1, 2, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void removeByValueTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Object o = 2;
        list.remove(o);

        int[] arr = new int[]{0, 1, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void removeByValueTest3() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        Object o = 3;
        list.remove(o);

        int[] arr = new int[]{0, 1, 2};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void SetTest1() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.set(0, 100);

        int[] arr = new int[]{100, 1, 2, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    @Test
    public void SetTest2() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.set(2, 100);

        int[] arr = new int[]{0, 1, 100, 3};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }


    @Test
    public void SetTest3() {
        LinkedListCollection<Integer> list = new LinkedListCollection<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }

        list.set(list.size() - 1, 100);

        int[] arr = new int[]{0, 1, 2, 100};
        int i = arr.length - 1;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            assertEquals(arr[i], (int) iterator.previous());
            i--;
        }
    }

    /**********************************/

    @Test
    public void testSizeWhenSizeIs0() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        assertEquals(0, testInstance.size());
    }

    @Test
    public void testIsEmptyWhenEmpty() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        assertTrue(testInstance.isEmpty());
    }

    @Test
    public void testContains() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        assertTrue(testInstance.contains(1));
        assertFalse(testInstance.contains(0));
    }

    @Test
    public void testContainsOnNull() {
        LinkedListCollection<Object> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(null);
        testInstance.add("s");

        assertTrue(testInstance.contains(1));
        assertTrue(testInstance.contains(null));
        assertTrue(testInstance.contains("s"));
        assertFalse(testInstance.contains("d"));
    }

    @Test
    public void testToArrayWhenInputArrayHaveSizeOne() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add(3);

        final Integer[] input = new Integer[1];

        final Integer[] result = testInstance.toArray(input);
        assertNotEquals(input, result);
        assertEquals((Integer) 1, result[0]);
        assertEquals((Integer) 2, result[1]);
        assertEquals((Integer) 3, result[2]);
        assertEquals(3, result.length);
    }

    @Test
    public void testToArrayWhenInputArrayHaveCorrectSize() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add(3);

        final Integer[] input = new Integer[3];

        final Integer[] result = testInstance.toArray(input);
        assertArrayEquals(input, result);
    }


    @Test
    public void testAdd() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(1);

        assertEquals(2, testInstance.size());
        assertFalse(testInstance.isEmpty());
    }

    @Test
    public void testRemoveFirstIndex() {
        LinkedListCollection<String> testInstance = new LinkedListCollection<>();
        testInstance.add("a");
        testInstance.add("b");
        testInstance.add("c");
        testInstance.remove(0);

        assertEquals(2, testInstance.size());
        assertFalse(testInstance.isEmpty());
    }

    @Test
    public void testRemoveLastIndex() {
        LinkedListCollection<String> testInstance = new LinkedListCollection<>();
        testInstance.add("a");
        testInstance.add("b");
        testInstance.add("c");
        testInstance.remove(2);
        testInstance.remove(1);

        assertEquals(1, testInstance.size());
        assertFalse(testInstance.isEmpty());
    }

    @Test
    public void testRemoveFirstItem() {
        LinkedListCollection<String> testInstance = new LinkedListCollection<>();
        testInstance.add("a");
        testInstance.add("b");
        testInstance.add("c");
        testInstance.remove("a");

        assertEquals(2, testInstance.size());
        assertFalse(testInstance.isEmpty());
    }

    @Test
    public void testRemoveLastItem() {
        LinkedListCollection<String> testInstance = new LinkedListCollection<>();
        testInstance.add("a");
        testInstance.add("b");
        testInstance.add("c");
        testInstance.remove("c");
        testInstance.remove("b");

        assertEquals(1, testInstance.size());
        assertFalse(testInstance.isEmpty());
    }

    @Test
    public void testContainsAll() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        LinkedListCollection<Integer> testInstance2 = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        testInstance2.add(2);
        testInstance2.add(1);

        assertTrue(testInstance.containsAll(testInstance2));
    }

    @Test
    public void testAddAll() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        testInstance.add(3);
        testInstance.add(4);

        assertTrue(testInstance.contains(3));
        assertTrue(testInstance.contains(4));
    }

    @Test
    public void testRemoveAll() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        LinkedListCollection<Integer> testInstance2 = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        testInstance2.add(2);
        testInstance2.add(3);

        testInstance.removeAll(testInstance2);

        assertEquals(1, testInstance.size());
        assertTrue(testInstance.contains(1));
    }

    @Test
    public void testRetainAll() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        LinkedListCollection<Integer> testInstance2 = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        testInstance2.add(2);
        testInstance2.add(3);

        testInstance.retainAll(testInstance2);

        assertEquals(1, testInstance.size());
        assertTrue(testInstance.contains(2));
    }

    @Test
    public void testClear() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(1);

        testInstance.clear();

        assertTrue(testInstance.isEmpty());
        assertEquals(0, testInstance.size());
    }

    @Test
    public void testRemoveByIndex() throws RuntimeException {
        LinkedListCollection<String> testInstance = new LinkedListCollection<>();
        testInstance.add("a");
        testInstance.add("b");
        testInstance.add("c");
        testInstance.add("d");

        try {
            testInstance.remove(5);
        } catch (final NullPointerException e1) {
            throw new RuntimeException(
                    "The remove(index) method did not check the marginal values of index. " +
                            "IndexOutOfBoundsException was expected. " +
                            "So get the NullPointerException.", e1);
        } catch (final IndexOutOfBoundsException e) {
        }


        assertEquals("Method remove(index) must return deleted element", "b", testInstance.remove(1));

        assertEquals("Method remove(index) could not delete the last element", "d", testInstance.remove(2));

        assertEquals("Method remove(index) could not delete the first element", "a", testInstance.remove(0));

        testInstance.remove(0);

    }

    @Test
    public void testSetInList() {
        LinkedListCollection<Object> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add("trololo");

        assertEquals(1, testInstance.get(0));
        assertEquals(2, testInstance.get(1));
    }

    @Test
    public void testSetInListOnException() {
        LinkedListCollection<Object> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add("trololo");


        try {
            testInstance.set(3, -25);
            fail("The set () method should throw an exception on the invalid inbound index!");
        } catch (Exception e) {
        }

        try {
            testInstance.set(-1, 25);
            fail("The set () method should throw an exception on the invalid inbound index!");
        } catch (Exception e) {
        }
    }

    @Test
    public void testGetInList() {
        LinkedListCollection<Object> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add("trololo");

        assertEquals(1, testInstance.get(0));
        assertEquals(2, testInstance.get(1));
    }

    @Test
    public void testGetInListOnException() {
        LinkedListCollection<Object> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add("trololo");


        try {
            testInstance.get(-25);
            fail("The set () method should throw an exception on the invalid inbound index!");
        } catch (Exception e) {
        }

        try {
            testInstance.get(3);
            fail("The set () method should throw an exception on the invalid inbound index!");
        } catch (Exception e) {
        }
    }

    @Test
    public void testIndexOfInList() {
        LinkedListCollection<Object> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add("trololo");
        testInstance.add(null);
        ///testInstance.indexOf(2);
        assertEquals(1, testInstance.indexOf(2));
        assertEquals(2, testInstance.indexOf("trololo"));
    }


    @Test
    public void testHasNextInEmptyList() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        final ListIterator<Integer> iter = testInstance.listIterator();
        assertFalse(iter.hasNext());
    }

    @Test
    public void testHasNext() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(3);
        final ListIterator<Integer> iter = testInstance.listIterator();
        assertTrue(iter.hasNext());
        testInstance.add(3);
        testInstance.add(3);
        assertTrue(iter.hasNext());
    }


    @Test
    public void testNextOnEmptyCollection() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        LinkedListCollection<Integer> testInstance2 = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        final ListIterator<Integer> iter = testInstance.listIterator();
        iter.next();
        iter.remove();
        iter.next();
        iter.remove();
        try {
            iter.next();
            fail("next do not throw the Exception when no more elements");
        } catch (final java.util.NoSuchElementException e) {
        }
        final ListIterator<Integer> iter2 = testInstance2.listIterator();
        try {
            iter2.next();
            fail("next do not throw the Exception when no  elements");
        } catch (final java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void testNextOnOneElementInCollection() {
        LinkedListCollection<String> testInstance = new LinkedListCollection<>();
        testInstance.add("a");


        final Iterator iter = testInstance.iterator();
        iter.next();

    }

    @Test
    public void testNextAfterPrevious() {
        LinkedListCollection<String> testInstance = new LinkedListCollection<>();
        testInstance.add("a");
        testInstance.add("a");
        testInstance.add("a");

        final ListIterator iter = testInstance.listIterator(3);
        iter.previous();
        iter.next();
        iter.previous();
        iter.previous();
        iter.next();
        iter.previous();
        iter.previous();
        iter.next();
    }

    @Test
    public void testHasPreviousWhenIteratorAtTheEndOfTheCollection() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        final ListIterator<Integer> listIterator = testInstance.listIterator();
        listIterator.next();

        assertTrue(listIterator.hasPrevious());
    }

    @Test
    public void testHasPreviousWhenIteratorAtTheBeginningOfTheCollection() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        final ListIterator<Integer> listIterator = testInstance.listIterator();
        listIterator.next();
        listIterator.previous();
    }

    @Test
    public void testHasPreviousWhenEmptyCollection() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();

        final ListIterator<Integer> listIterator = testInstance.listIterator();

        assertFalse(listIterator.hasPrevious());
    }

    @Test
    public void testPreviousOnCollectionWithOneElement() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);

        final ListIterator<Integer> listIterator = testInstance.listIterator();
        final Integer next = listIterator.next();
        final Integer previous = listIterator.previous();

        assertEquals(next, previous);
    }

    @Test
    public void testPreviousWhenEmptyCollection() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();

        final ListIterator<Integer> listIterator = testInstance.listIterator();

        try {
            listIterator.previous();
            fail("list iterator do not throw the Exception when called previous method on empty collection");
        } catch (final java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void testPreviousAfterNext() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(0);
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add(3);
        testInstance.add(4);
        testInstance.add(5);

        final ListIterator<Integer> listIterator = testInstance.listIterator();
        while (listIterator.hasNext()) listIterator.next();
        while (listIterator.hasPrevious()) listIterator.previous();
        assertEquals(listIterator.next(), listIterator.previous());
    }

    @Test
    public void testPreviousSeveralTimesOneByOneFromTheEndOfList() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(0);
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add(3);
        testInstance.add(4);
        testInstance.add(5);

        final ListIterator<Integer> listIterator = testInstance.listIterator(6);
        listIterator.previous();
        listIterator.previous();
        listIterator.previous();
        listIterator.previous();
        listIterator.previous();
        listIterator.previous();
    }

    @Test
    public void testIteratorSet() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);
        testInstance.add(3);
        testInstance.add(4);

        final ListIterator<Integer> listIterator = testInstance.listIterator(2);
        listIterator.next();
        listIterator.set(0);
        assertEquals((Integer) 0, testInstance.get(2));
        listIterator.previous();
        listIterator.previous();
        listIterator.set(9);
        assertEquals((Integer) 9, testInstance.get(1));
    }

    @Test
    public void testIteratorSetWhenNeitherNextNorPreviousHaveBeenCalled() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);

        final ListIterator<Integer> listIterator = testInstance.listIterator();

        try {
            listIterator.set(null);
            fail("set method do not throw IllegalStateException the if neither next nor previous have been called");
        } catch (final IllegalStateException e) {
        }
    }

    @Test
    public void testPreviousIndex() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);

        final ListIterator<Integer> listIterator = testInstance.listIterator();
        listIterator.next();

        assertEquals(0, listIterator.previousIndex());
    }

    @Test
    public void testPreviousIndexWhenItEqualsTo1() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(1);

        final ListIterator<Integer> listIterator = testInstance.listIterator();
        listIterator.next();
        listIterator.next();

        assertEquals(1, listIterator.previousIndex());
    }

    @Test
    public void testPreviousIndexWhenEmptyCollection() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();

        final ListIterator<Integer> listIterator = testInstance.listIterator();

        assertEquals(-1, listIterator.previousIndex());
    }

    @Test
    public void testNextIndex() {
        LinkedListCollection<String> testInstance = new LinkedListCollection<>() {
            {
                add("a");
                add("b");
                add("c");
                add("d");
                add("e");
            }
        };
        final ListIterator<String> listIterator = testInstance.listIterator(5);
        assertEquals(5, listIterator.nextIndex());
        assertEquals("e", listIterator.previous());
        assertEquals(4, listIterator.nextIndex());
        assertEquals("e", listIterator.next());
        assertEquals(5, listIterator.nextIndex());
    }

    @Test
    public void testNextIndexInEmptyList() {
        final LinkedListCollection testInstance = new LinkedListCollection();
        final ListIterator listIterator = testInstance.listIterator();
        assertEquals(0, listIterator.nextIndex());
        assertEquals(testInstance.size(), listIterator.nextIndex());
    }

    @Test
    public void testRemoveTwoTimeInTheRow() {
        final Collection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        final Iterator<Integer> iter = testInstance.iterator();
        iter.next();
        iter.remove();
        try {
            iter.remove();
            fail("remove do not throw the Exception when called twice");
        } catch (final IllegalStateException e) {
        }
    }


    @Test
    public void testRemoveAfterPrevious() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(1);
        testInstance.add(2);

        final ListIterator<Integer> listIterator = testInstance.listIterator();
        listIterator.next();
        listIterator.next();
        listIterator.previous();
        listIterator.remove();
    }

    @Test
    public void testRemoveBeforeNext() {
        LinkedListCollection<Integer> testInstance = new LinkedListCollection<>();
        testInstance.add(2);

        final Iterator<Integer> iter = testInstance.iterator();
        try {
            iter.remove();
            fail("remove do not throw the Exception when called before next");
        } catch (final IllegalStateException e) {
        }
    }

}