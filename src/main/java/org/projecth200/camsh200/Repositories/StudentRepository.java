package org.projecth200.camsh200.Repositories;

import org.projecth200.camsh200.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
