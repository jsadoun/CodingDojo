package com.sadounj.courses.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sadounj.courses.models.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

	Course findByCourseName(String courseName);

	Course findByInstructorName(String instructorName);

	Course findByCourseLimit(Integer courseLimit);
	
}