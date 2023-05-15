package com.springrest.springrest.services;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceimpl implements CourseServices {
@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	public CourseServiceimpl() {
		
//		list = new ArrayList<>();
//		
//		list.add(new Course(145, "Java" ,"this course contains basics of java "));
//		list.add(new Course(440, "SpringBoot" ,"this course contains concept of Spring "));
	}
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

@Override
	public Course getCourse(long courseId)
	{
//	Course c =null;
//	for(Course course:list)
//	{
//		if(course.getId()==courseId)
//		{
//			c=course;
//			break;
//		}
//	}
		return courseDao.getReferenceById(courseId);
	}


@Override
public Course addCourse(Course course) {
	// TODO Auto-generated method stub
	//list.add(course);
	courseDao.save(course);
	return course;
}


@Override
public Course updateCourse(Course course) {
	// TODO Auto-generated method stub
//	list.forEach(e -> {
//	if(e.getId()== course.getId())
//	{
//		e.setTitle(course.getTitle());
//		e.setDescription(course.getDescription());
//	}
//	});
	courseDao.save(course);
	return course;
}


@Override
public void deleteCourse(long parseLong) {
	// TODO Auto-generated method stub
	//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	
	Course entity = courseDao.getReferenceById(parseLong);
	courseDao.delete(entity);
}
	
	
}
