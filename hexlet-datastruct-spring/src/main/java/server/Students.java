package server;

import model.Student;
import model.StudentsGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Students {
    private final static Map<String, Student> STUDENTS = StudentsGenerator.getStudents();

    @GetMapping("/students")
    public String getStudents() {
        return STUDENTS.keySet().toString();
    }

    @GetMapping("/students/{studentId}")
    public String getStudentName(@PathVariable("studentId") String id) {
//        return STUDENTS.get(id).toString();

        // в случае если вызываем id несуществющего студента то чтобы не падать на NullPointerException
        // добавляем вызов через метод getOrDefault и возвращает дефолтное значение в случае если не находит id по запросу
        return STUDENTS.getOrDefault(id, new Student("id " + id, "Not found")).toString();
    }
}
