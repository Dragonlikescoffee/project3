package com.example.project3;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAll();
    // You can add custom queries here if needed
}
