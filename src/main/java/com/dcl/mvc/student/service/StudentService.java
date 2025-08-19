package com.dcl.mvc.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.dcl.mvc.student.entity.Student;
import com.dcl.mvc.student.repository.StduentRepository;

@Service
public class StudentService {

	@Autowired
	private StduentRepository stduentRepository;
	
	public ModelAndView addStudent(Student student) {
		// Resolving request
		
		stduentRepository.saveStudent(student);
		
		//resolving repsonce
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		
		return mav;
	}

	public ModelAndView findStudent(Student student) {
		
	List<Student> student1 =	stduentRepository.fetchStudent(student);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("findStudent.jsp");
		
		mav.addObject("key1", student1);
		
		// return new ModelAndView("findStudent.jsp").addObject("key1", student1);
		return mav;
	}

	public ModelAndView updateStudent(int id) {
		
		Student student =stduentRepository.mergStudent(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("updateStudent.jsp");
		
		mav.addObject("key1", student);
		
		return mav;
	}

	public ModelAndView changeStudent(Student student) {
		
		stduentRepository.mergeStudent(student);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display-all-student");
		mav.addObject("key1", student);	
		return mav;
	}

	public ModelAndView deleteStudent(int id) {
		stduentRepository.deleteStudent(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display-all-student");
		
				return mav;
	}

}
