package com.dcl.mvc.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dcl.mvc.student.entity.ProfileUrl;
import com.dcl.mvc.student.service.ProfileUrlService;

@Controller
public class ProfileUrlController {
	@Autowired
	private ProfileUrlService profileUrlService;

	@RequestMapping(value="/find-all-profiles",method = RequestMethod.GET)
	public ModelAndView displayAllProfilesByStudentId(int StudentId) {
		return profileUrlService.findAllProfilesByStudentId(StudentId);
	}
	
	@RequestMapping(value="/add-profile",method =RequestMethod.POST)
	public ModelAndView createProfile(int StudentId,ProfileUrl profileUrl) {
		return profileUrlService.addProfile(StudentId,profileUrl);
	}
}
