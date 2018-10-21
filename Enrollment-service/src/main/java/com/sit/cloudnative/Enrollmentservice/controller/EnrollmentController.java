package com.sit.cloudnative.Enrollmentservice.controller;

import com.sit.cloudnative.Enrollmentservice.model.Enrollment;
import com.sit.cloudnative.Enrollmentservice.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
public class EnrollmentController {
  @Autowired
  private EnrollmentService enrollmentService;

  @PostMapping("/enroll")
  public Enrollment enroll(@Valid @RequestBody Enrollment enrollment) {
    return enrollmentService.enroll(enrollment);
  }

}
