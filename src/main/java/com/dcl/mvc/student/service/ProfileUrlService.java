package com.dcl.mvc.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.dcl.mvc.student.entity.ProfileUrl;
import com.dcl.mvc.student.entity.Student;
import com.dcl.mvc.student.repository.ProfileUrlRepository;
import com.dcl.mvc.student.repository.StduentRepository;

@Service
public class ProfileUrlService {

	@Autowired
	private ProfileUrlRepository profileUrlRepository;
	
	@Autowired
	private StduentRepository stduentRepository;
	
	public ModelAndView findAllProfilesByStudentId(int StudentId) {
		
		//resolving request
		Student student = stduentRepository.findById(StudentId);
		
		List<ProfileUrl> profileUrl = student.getProfileurl();
		// Genrate response
		return new ModelAndView("displayAllProfiles.jsp").addObject("profileOfStudent", profileUrl)
				.addObject("studentId", StudentId);
	}
	
	
	public ModelAndView addProfile(int studentId,ProfileUrl profileUrl) {
		//reloving request
		Student student = stduentRepository.findById(studentId);
		
		student.getProfileurl().add(profileUrl);
		stduentRepository.mergeStudent(student);
		
		profileUrl.setStudent(student);
		
		profileUrlRepository.saveProfile(profileUrl);
				
		return new ModelAndView("displayAllProfiles.jsp").addObject("profileOfStudent", profileUrl)
				.addObject("studentId", studentId);
	}

}
