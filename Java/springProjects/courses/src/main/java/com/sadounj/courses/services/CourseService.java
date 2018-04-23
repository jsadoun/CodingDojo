package com.sadounj.courses.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sadounj.courses.models.Course;
import com.sadounj.courses.repositories.CourseRepository;


@Service
public class CourseService {
	private CourseRepository courseRepo;
	private UserService userService;
	
	public CourseService(CourseRepository courseRepo) {
		this.courseRepo = courseRepo;
	}

	public void create(Course course){
		courseRepo.save(course);
	}
	
	public void update(Course course){
		courseRepo.save(course);
	}
	
	public void destroy(Long id){
		courseRepo.deleteById(id);
	}
	
	public Course findByCourseName(String courseName) {
		return courseRepo.findByCourseName(courseName);
	}
	
	public Course findByInstructorName(String instructorName) {
		return courseRepo.findByInstructorName(instructorName);
	}
	
	public Course findByCourseLimit(Integer courseLimit) {
		return courseRepo.findByCourseLimit(courseLimit);
	}
    
    public ArrayList<Course> all(){
    		return (ArrayList<Course>)courseRepo.findAll();
    }

	public Optional <Course> find(Long id) {
		return courseRepo.findById(id);
	}
	
	
	
}
