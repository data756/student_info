package service.student_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.student_info.controller.Student_Info;
import service.student_info.repository.StudentRepository;


@SpringBootApplication(excludeName = "")
@EnableJpaRepositories(basePackages = "service.student_info.*")
public class StudentInfoApplication implements CommandLineRunner {


	StudentRepository repository;

    public static void main(String[] args) {

        SpringApplication.run(StudentInfoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Student_Info student = repository.findById(2).get();
        System.out.println(student.getFirstName());
    }
}
