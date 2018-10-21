package com.sit.cloudnative.Enrollmentservice.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class EnrollmentIdentity implements Serializable {

  @NotNull
  private Long courseId;

  @NotBlank
  private String studentId;

  public EnrollmentIdentity() {
  }

  public EnrollmentIdentity(@NotNull Long courseId, @NotBlank String studentId) {
    this.courseId = courseId;
    this.studentId = studentId;
  }

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }
}
