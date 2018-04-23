package com.sadounj.courses.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sadounj.courses.models.User;

@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    @Size(min=1, max=255, message="Course Name cannot be blank.")
    private String courseName;
    @Size(min=1, max=255, message="Instructor cannot be blank.")
    private String instructorName;
    @NotNull
    private Integer currentSize; 
//    @Min(1)
//    @Max(500)
    @NotNull
    @DecimalMax("500.0")
    private Integer courseLimit; 
    @DateTimeFormat(pattern="MM:dd:yyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern="MM:dd:yyy HH:mm:ss")
    private Date updatedAt;
    
    
    @ManyToMany(mappedBy = "courses")
    private List<User> users;
    
    public Course() {
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public Integer getCurrentSize() {
        return currentSize;
    }
    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }
    public Integer getCourseLimit() {
        return courseLimit;
    }
    public void setCourseLimit(Integer courseLimit) {
        this.courseLimit = courseLimit;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

}