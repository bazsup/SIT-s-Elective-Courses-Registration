package com.sit.cloudnative.Courseservice;

import com.sit.cloudnative.Courseservice.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
  @Autowired
  private CourseRepositoryInterface courseRepositoryInterface;

  public List<Course> getAllCourse() {
    return courseRepositoryInterface.findAll();
  }

  public Course getCourseById(Long courseId) {
    return courseRepositoryInterface.getOne(courseId);
  }

  public Course create(Course course) {
    return courseRepositoryInterface.save(course);
  }

  public Course update(Long courseId, Course inboundCourse) {
    return courseRepositoryInterface.findById(courseId).map(course -> {
      course.setCourse(inboundCourse.getCourse());
      course.setCourseName(inboundCourse.getCourseName());
      course.setLecturer(inboundCourse.getLecturer());
      course.setMaxAmountStudent(inboundCourse.getMaxAmountStudent());
      return courseRepositoryInterface.save(course);
    }).orElseThrow(() ->
            new ResourceNotFoundException(String.format("Course:id %d not found", courseId))
    );
  }

  public Object delete(Long courseId) {
    return courseRepositoryInterface.findById(courseId).map(user -> {
      courseRepositoryInterface.delete(user);
      return ResponseEntity.ok().build();
    }).orElseThrow(() ->
            new ResourceNotFoundException(String.format("Course:id %d not found", courseId))
    );
  }
}
