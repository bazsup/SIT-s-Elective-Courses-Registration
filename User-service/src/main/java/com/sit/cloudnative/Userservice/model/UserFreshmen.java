package com.sit.cloudnative.Userservice.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class UserFreshmen extends User {

  private static byte year = 1;

  @Override
  public byte getYear() {
    return this.year;
  }

  @Override
  public void setYear(byte year) {
    this.year = year;
  }

  @Override
  public int getMaximumCourseCanEnroll() {
    return 0;
  }
}
