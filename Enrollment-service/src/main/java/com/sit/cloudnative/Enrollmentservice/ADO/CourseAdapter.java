package com.sit.cloudnative.Enrollmentservice.ADO;

import com.sit.cloudnative.Enrollmentservice.DTO.CourseView;
import org.springframework.web.client.RestTemplate;

public class CourseAdapter {

  public CourseView getCourseById(Long courseId) {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(String.format("http://localhost:8081/course/%d", courseId) , CourseView.class);
  }
}
