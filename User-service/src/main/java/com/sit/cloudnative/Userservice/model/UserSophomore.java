package com.sit.cloudnative.Userservice.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class UserSophomore extends User {

  private static byte year = 2;

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
