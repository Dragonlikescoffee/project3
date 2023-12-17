package com.example.project3;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAll();
    // You can add custom queries here if needed
}
