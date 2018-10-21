package com.sit.cloudnative.Enrollmentservice.ADO;

import com.sit.cloudnative.Enrollmentservice.DTO.CourseView;
import com.sit.cloudnative.Enrollmentservice.DTO.UserView;
import org.springframework.web.client.RestTemplate;

public class UserAdapter {

  public UserView getUserByStudentId(String student_id) {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(String.format("http://localhost:8080/user/%s", student_id) , UserView.class);
  }
}
