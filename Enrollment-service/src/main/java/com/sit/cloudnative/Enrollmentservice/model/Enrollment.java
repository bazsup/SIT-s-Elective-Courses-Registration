package com.sit.cloudnative.Enrollmentservice.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "enrollments")
public class Enrollment {

  @EmbeddedId
  private EnrollmentIdentity enrollmentIdentity;

  public Enrollment() {
  }

  public Enrollment(EnrollmentIdentity enrollmentIdentity) {
    this.enrollmentIdentity = enrollmentIdentity;
  }

  public EnrollmentIdentity getEnrollmentIdentity() {
    return enrollmentIdentity;
  }

  public void setEnrollmentIdentity(EnrollmentIdentity enrollmentIdentity) {
    this.enrollmentIdentity = enrollmentIdentity;
  }
}
