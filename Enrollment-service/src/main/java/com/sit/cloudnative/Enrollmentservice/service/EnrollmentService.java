package com.sit.cloudnative.Enrollmentservice.service;

import com.sit.cloudnative.Enrollmentservice.ADO.CourseAdapter;
import com.sit.cloudnative.Enrollmentservice.ADO.UserAdapter;
import com.sit.cloudnative.Enrollmentservice.DTO.CourseView;
import com.sit.cloudnative.Enrollmentservice.DTO.UserView;
import com.sit.cloudnative.Enrollmentservice.model.Enrollment;
import com.sit.cloudnative.Enrollmentservice.model.EnrollmentIdentity;
import com.sit.cloudnative.Enrollmentservice.repository.EnrollmentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

  @Autowired
  private EnrollmentRepositoryInterface enrollmentRepositoryInterface;

  public Enrollment enroll(Enrollment enrollment) {
    EnrollmentIdentity enrollmentIdentity = enrollment.getEnrollmentIdentity();
    Long courseId = enrollmentIdentity.getCourseId();
    String studentId = enrollmentIdentity.getStudentId();
    if (checkCourseCanEnroll(courseId) && checkStudentCanEnroll(studentId)) {
      return enrollmentRepositoryInterface.save(enrollment);
    }
    return null;
  }

  public boolean checkCourseCanEnroll(Long courseId) {
    CourseAdapter courseAdapter = new CourseAdapter();
    Long numOfCourseEnroll = enrollmentRepositoryInterface.countEnrollmentByCourseId(courseId);
    CourseView course = courseAdapter.getCourseById(courseId);
    return course.getMaxAmountStudent() > numOfCourseEnroll;
  }

  public boolean checkStudentCanEnroll(String studentId) {
    UserAdapter userAdapter = new UserAdapter();
    Long numOfEnroll = enrollmentRepositoryInterface.countEnrollmentByStudentId(studentId);
    UserView user = userAdapter.getUserByStudentId(studentId);
    return user.getMaximumCourseCanEnroll() > numOfEnroll;
  }
}
