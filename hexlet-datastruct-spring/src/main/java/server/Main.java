package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {

    @RequestMapping("/")
    public String getStudents() {
        return "Hello Class!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
