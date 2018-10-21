package com.sit.cloudnative.Enrollmentservice.DTO;

public class UserView {

  private String studentId;

  private String firstname;

  private String lastname;

  private String department;

  private String faculty;

  private byte year;

  private int maximumCourseCanEnroll;

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public byte getYear() {
    return year;
  }

  public void setYear(byte year) {
    this.year = year;
  }

  public int getMaximumCourseCanEnroll() {
    return maximumCourseCanEnroll;
  }

  public void setMaximumCourseCanEnroll(int maximumCourseCanEnroll) {
    this.maximumCourseCanEnroll = maximumCourseCanEnroll;
  }
}
