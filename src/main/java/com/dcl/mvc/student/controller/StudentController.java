package com.dcl.mvc.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dcl.mvc.student.entity.Student;
import com.dcl.mvc.student.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/add-student", method = RequestMethod.POST)
	public ModelAndView createStduent(Student student) {

		return studentService.addStudent(student);

	}

	@RequestMapping(value = "/display-all-student")
	public ModelAndView getStudent(Student student) {
		return studentService.findStudent(student);
	}

	@RequestMapping(value = "/find-by-id", method = RequestMethod.GET)
	public ModelAndView changeStudent(@RequestParam("StudentId") int id) {
		return studentService.updateStudent(id);

	}

	@RequestMapping(value = "/update-student", method = RequestMethod.POST)
	public ModelAndView updateStudent(Student student) {
		return studentService.changeStudent(student);
	}

	@RequestMapping(value = "delete-by-id", method = RequestMethod.GET)
	public ModelAndView removeStudent(@RequestParam("StudentId") int id) {
		return studentService.deleteStudent(id);
	}
}
