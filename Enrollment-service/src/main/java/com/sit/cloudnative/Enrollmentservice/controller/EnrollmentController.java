package com.sit.cloudnative.Enrollmentservice.controller;

import com.sit.cloudnative.Enrollmentservice.DTO.CourseView;
import com.sit.cloudnative.Enrollmentservice.DTO.UserView;

import com.sit.cloudnative.Enrollmentservice.model.Enrollment;
import com.sit.cloudnative.Enrollmentservice.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EnrollmentController {
//  private User user;
  @Autowired
  private EnrollmentService enrollmentService;

  @GetMapping("/course")
  public CourseView getCourse() {
    RestTemplate restTemplate = new RestTemplate();
    CourseView course = restTemplate.getForObject("http://localhost:8081/course/1", CourseView.class);
    return course;
  }

  @GetMapping("/user")
  public UserView getUser() {
    RestTemplate restTemplate = new RestTemplate();
    UserView user = restTemplate.getForObject("http://localhost:8080/user/59130500137", UserView.class);
    return user;
  }

  @PostMapping("/enroll")
  public Enrollment enroll(@Valid @RequestBody Enrollment enrollment) {
    return enrollmentService.enroll(enrollment);
  }

  @GetMapping("/enroll")
  public List<Enrollment> getAllEnroll() {
    return enrollmentService.getAllEnroll();
//    return enrollmentService.enroll(enrollment);
  }

}
