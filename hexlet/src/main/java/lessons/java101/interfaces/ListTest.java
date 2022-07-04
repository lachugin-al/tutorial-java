package lessons.java101.interfaces;

import java.util.ArrayList;
import java.util.List;

// List хранит все как ОБЪЕКТЫ и не знает какого типа эти объекты
// поэтому явно достать интеджер из листа

public class ListTest {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add(12);
        Object o = myList.get(0); // достаем объект из 0 индекса
        Integer i = (Integer)myList.get(0); // достаем объект интеджер из индекса 0
        System.out.println(myList + " " + o + " " + i);
        myList.add("Hello");
        String s = (String)myList.get(1);
        System.out.println(myList + " " + s);
    }

}
