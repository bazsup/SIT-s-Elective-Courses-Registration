package com.sit.cloudnative.Courseservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CourseContoller {

  @Autowired
  private CourseService courseService;

  @GetMapping("/courses")
  public ResponseEntity<List<Course>> getAllCourse() {
    return new ResponseEntity<List<Course>>(courseService.getAllCourse(), HttpStatus.OK);
  }

  @GetMapping("/course/{course_id:[\\d]}")
  public ResponseEntity<Course> getCourseById(@PathVariable("course_id") Long courseId) {
    return new ResponseEntity<Course>(courseService.getCourseById(courseId), HttpStatus.OK);
  }

  @PostMapping("/course")
  public ResponseEntity<Course> createCourse(@Valid @RequestBody Course course) {
    return new ResponseEntity<Course>(courseService.create(course), HttpStatus.CREATED);
  }

  @PutMapping("/course/{course_id:[\\d]}")
  public ResponseEntity<Course> updateCourse(@PathVariable("course_id") Long courseId,
                                         @Valid @RequestBody Course user) {
    return new ResponseEntity<Course>(courseService.update(courseId, user), HttpStatus.OK);
  }

  @DeleteMapping("/course/{course_id:[\\d]}")
  public ResponseEntity<Object> deleteCourse(@PathVariable("course_id") Long courseId) {
    return new ResponseEntity<Object>(courseService.delete(courseId), HttpStatus.OK);
  }
}
