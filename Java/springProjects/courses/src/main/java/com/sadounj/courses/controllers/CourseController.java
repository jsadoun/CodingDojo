package com.sadounj.courses.controllers;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sadounj.courses.services.CourseService;
import com.sadounj.courses.services.UserService;
import com.sadounj.courses.models.User;
import com.sadounj.courses.models.Course;


@Controller
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private CourseService courseService;
	@Autowired
	private UserService userService;

	
    @RequestMapping(value = {"/", "/courses"})
    public String home(Principal principal, Model model) {
    		String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
		model.addAttribute("courses", courseService.all());
        return "courses";
    }
	
	@RequestMapping("/new")
	public String newCourse(Model model, @ModelAttribute("course") Course course) {
		return "createCourse";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("course") Course course,BindingResult res,RedirectAttributes re,Model model){				
//		if(res.hasErrors()){
// 			re.addFlashAttribute("errs",res.getAllErrors());
//		}else{
//		}
		courseService.create(course);
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Long id,Model model){
		model.addAttribute("course",courseService.find(id));
		model.addAttribute("useres",userService.all());
		return "individualCourse";
	}
	
	@PostMapping("/{courseId}")
	public String add(@PathVariable("courseId") Long courseId,@RequestParam("user") Long userId){
		Optional<Course> course   = courseService.find(courseId);
		Course c = course.get();
		Optional<User> user = userService.find(userId);
		User person = user.get();
		List<User> users = c.getUsers();
		
		users.add(person);
		courseService.update(c);
		
		return "redirect:/";
	}

}
