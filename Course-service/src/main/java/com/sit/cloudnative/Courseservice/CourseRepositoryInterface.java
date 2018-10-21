package com.sit.cloudnative.Courseservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepositoryInterface extends JpaRepository<Course, Long> {

}
