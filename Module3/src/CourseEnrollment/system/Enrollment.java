package CourseEnrollment.system;

import java.io.Serializable;

import CourseEnrollment.model.Student;
import CourseEnrollment.model.Course;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    // Getters
    public Student getStudent() {
        return this.student;
    }

    public Course getCourse() {
        return this.course;
    }

    public String getEnrollmentDate() {
        return this.enrollmentDate;
    }

    // Setters
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment date: " + this.enrollmentDate + "\n" + this.student.toString() + "\n" + this.course.toString();
    }
}
