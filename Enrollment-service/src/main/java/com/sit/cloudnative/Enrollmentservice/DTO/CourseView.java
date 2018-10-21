package com.sit.cloudnative.Enrollmentservice.DTO;

public class CourseView {

  private Long courseId;

  private String course;

  private String courseName;

  private String lecturer;

  private int maxAmountStudent;

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getLecturer() {
    return lecturer;
  }

  public void setLecturer(String lecturer) {
    this.lecturer = lecturer;
  }

  public int getMaxAmountStudent() {
    return maxAmountStudent;
  }

  public void setMaxAmountStudent(int maxAmountStudent) {
    this.maxAmountStudent = maxAmountStudent;
  }
}
