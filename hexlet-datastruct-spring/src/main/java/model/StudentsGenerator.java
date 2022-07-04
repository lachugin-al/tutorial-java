package model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class StudentsGenerator {

    public static Map<String, Student> getStudents() {
        final Map<String, Student> students = new HashMap<String, Student>() {{
            put("1", new Student("1", "A"));
            put("2", new Student("1", "B"));
            put("3", new Student("1", "C"));
        }};

        // фиксим значение key и value чтобы id у них совпадали
        // проходимся по коллекции и сверяем key с getId и если совпадают то возвращаем текущего студента
        // если не совпадают то возвращаем нового студанта с одинаковыми полями key и getId
        for (String key : students.keySet())
            students.compute(key, new BiFunction<String, Student, Student>() {
                @Override
                public Student apply(String s, Student student) {
                    if (s.equals(student.getId())) return student;
                    return new Student(s, student.getName()); // тем самым перезаписываем value для key
                }
            });

        // тоже самое через лямбда вычисление
        for (String key : students.keySet())
            students.compute(key, (k, student) ->
                    k.equals(student.getId()) ? student : new Student(k, student.getName()));

        return students;
    }
}
