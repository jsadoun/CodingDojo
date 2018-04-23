package com.sadounj.login_reg.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sadounj.login_reg.models.User;
import com.sadounj.login_reg.services.UserService;

@Controller
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		this.userService=userService;
		
	}
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
        if (result.hasErrors()) {
            return "loginPage";
        }
        if(userService.findByEmail(user.getEmail() ) !=null ) {
        		model.addAttribute("emailError","A user with this email already exists.");
        		return "loginPage";
        }
        if(userService.findByUsername(user.getUsername() ) != null) {
        		model.addAttribute("usernameError", "This Username already exists.");
        		return "loginPage";
        }
        
        if(userService.all().size()<1) {
        		userService.saveUserWithAdminRole(user);
        }else {
        		userService.saveWithUserRole(user);
        }
        
        userService.saveWithUserRole(user);
        return "redirect:/login";
    }
    
    @RequestMapping("/login")
    public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model,@Valid @ModelAttribute("user") User user) {
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successful!");
        }
        return "loginPage";
    }
	
    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
    		String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "homePage";
    }
    
    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "adminPage";
    }
}