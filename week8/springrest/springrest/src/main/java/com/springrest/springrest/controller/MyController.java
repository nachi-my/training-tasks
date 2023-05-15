package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MyController {
	@Autowired
	private CourseServices courseService;

@GetMapping("/home")
	
	public String home() {
		return "Welcome to application";
	}

	//get courses
@GetMapping("/courses")
public List<Course> getCourses()
{
	return this.courseService.getCourses();
}
//get course by Id
@GetMapping("/courses/{courseId}")
public Course getCourse(@PathVariable String courseId)
{
	return this.courseService.getCourse(Long.parseLong(courseId));
}
//course add
@PostMapping("/courses")
public Course addCourse(@RequestBody Course course)
{
	return this.courseService.addCourse(course);
}

//update course using PUT Request

@PutMapping ("/courses")
public Course updateCourse (@RequestBody Course course) {
return this.courseService.updateCourse (course);
}
//delete the course
@DeleteMapping("/courses/{courseId}")
public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
 try {
     this.courseService.deleteCourse (Long.parseLong(courseId));
     return new ResponseEntity<>(HttpStatus.OK);
     } catch(Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
}
}
