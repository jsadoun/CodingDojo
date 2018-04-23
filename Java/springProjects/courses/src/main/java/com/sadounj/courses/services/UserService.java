package com.sadounj.courses.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sadounj.courses.models.User;
import com.sadounj.courses.repositories.UserRepository;


@Service
public class UserService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bcrypt;
    
    public UserService(UserRepository userRepository, BCryptPasswordEncoder bcrypt)     {
        this.userRepository = userRepository;
        this.bcrypt = bcrypt;
       
    }
    
    // 1
    public void saveWithUserRole(User user) {
        user.setPassword(bcrypt.encode(user.getPassword()));
        userRepository.save(user);
    }

    // 3
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    public User findByEmail(String email){
    		return userRepository.findByEmail(email);
    }
    
	public Optional<User> find(long id) {
		return userRepository.findById(id);
	}
    
    public ArrayList<User> all(){
    		return (ArrayList<User>)userRepository.findAll();
    }
}