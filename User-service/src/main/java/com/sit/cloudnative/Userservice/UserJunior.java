package com.sit.cloudnative.Userservice;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("3")
public class UserJunior extends User {

  private static byte year = 3;

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
    return 2;
  }
}
