package com.sit.cloudnative.Enrollmentservice.repository;

import com.sit.cloudnative.Enrollmentservice.model.Enrollment;
import com.sit.cloudnative.Enrollmentservice.model.EnrollmentIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepositoryInterface extends JpaRepository<Enrollment, EnrollmentIdentity> {

  @Query("SELECT COUNT(e) FROM Enrollments e WHERE e.student_id=:student_id")
  Long countEnrollmentByStudentId(@Param("student_id") String studentId);

  @Query("SELECT COUNT(e) FROM Enrollments e WHERE e.course_id=:course_id")
  Long countEnrollmentByCourseId(@Param("course_id") Long course_id);
}
