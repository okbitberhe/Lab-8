package com.example.eRegistrar.model;




import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
@Entity
@Table (name= "student")
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long StudentId;
    @NotBlank(message = "reuired")
    @Column(name = "studentNumber",unique= true,nullable = false, length = 15)
    private String studentNumber;
    @NotBlank(message = "first name must not be empty")
    private String Firstname;
    private String Middlname;
    @NotBlank(message = "last name must not be empty")
    private String lastName;
    private Double cgpa;
    @NotNull(message = "inscule enrollment date")
    private LocalDateTime enrollmentDate;
    @NotEmpty(message ="must select your entry")
    private String isInternational;

    public Student() {   }

    public Student(String studentNumber, String firstname, String middlname, String lastName, Double cgpa, LocalDateTime enrollmentDate, String isInternational) {
        this.studentNumber = studentNumber;
        Firstname = firstname;
        Middlname = middlname;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getMiddlname() {
        return Middlname;
    }

    public void setMiddlname(String middlname) {
        Middlname = middlname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Middlname='" + Middlname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", enrollmentDate=" + enrollmentDate +
                ", isInternational='" + isInternational + '\'' +
                '}';
    }
}
