package com.sit.cloudnative.Userservice.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("4")
public class UserSenior extends User {

  private static byte year = 4;

  @Override
  public byte getYear() {
    return year;
  }

  @Override
  public void setYear(byte year) {
    this.year = year;
  }

  @Override
  public int getMaximumCourseCanEnroll() {
    return 1;
  }
}
