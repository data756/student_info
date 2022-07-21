package service.student_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.student_info.controller.Student_Info;

@Repository
public interface StudentRepository extends JpaRepository <Student_Info,Integer>{
}
