package com.sadounj.courses.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sadounj.courses.models.Course;
import com.sadounj.courses.models.User;
import com.sadounj.courses.repositories.UserRepository;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {
    private UserRepository userRepository;
    
    public UserDetailsServiceImplementation(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    // 1
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //loadUserByUsername is the controller method that posts to login
        User user = userRepository.findByEmail(username);
        
        if(user == null) {
        		user = userRepository.findByUsername(username);
        		
        		if(user == null) {
        			throw new UsernameNotFoundException("User not found");
        		}
        }
        
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user));
    }
    
    // 2
    private List<GrantedAuthority> getAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for(Course course : user.getCourses()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(course.getCourseName());
            authorities.add(grantedAuthority);
        }
        return authorities;
    }
}