package server;

import model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeExample {

    public static void main(String[] args) {
        final Map<String, Student> students = new HashMap<String, Student>(){{
            put("1", new Student("1", "A"));
            put("2", new Student("1", "B"));
            put("3", new Student("1", "C"));
        }};
        final Map<String, Student> students2 = new HashMap<String, Student>(){{
            put("3", new Student("1", "A"));
            put("2", new Student("2", "B"));
            put("1", new Student("3", "C"));
            put("4", new Student("3", "C"));
            put("5", new Student("3", "C"));
        }};

        // если первый студент соответствет ключу то возвращаем студента иначе возвращаем второго студента
        /*for (Map.Entry<String, Student> e : students2.entrySet())
            students.merge(e.getKey(), e.getValue(), new BiFunction<String, Student, Student>() {
                @Override
                public Student apply(Student student, Student student2) {
                    if (student.getId().equals(e.getKey())) return student;
                     // тем самым перезаписываем value для key
                    return student2;
                }
            });*/

        // через лямбду
        for (Map.Entry<String, Student> e : students2.entrySet())
            students.merge(e.getKey(), e.getValue(), (s1, s2) -> s1.getId().equals(e.getKey()) ? s1 : s2);
        System.out.println(students);
    }

}
