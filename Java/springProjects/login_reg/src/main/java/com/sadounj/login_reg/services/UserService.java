package com.sadounj.login_reg.services;

import java.util.ArrayList;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sadounj.login_reg.models.Role;
import com.sadounj.login_reg.models.User;
import com.sadounj.login_reg.repositories.RoleRepository;
import com.sadounj.login_reg.repositories.UserRepository;
@Service
public class UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bcrypt;
    
    public UserService(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bcrypt)     {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bcrypt = bcrypt;
        
        init();
        
    }
    
    public void init() {
    		if(roleRepository.findAll().size() < 1 ) {
    			Role user = new Role();
    			user.setName("ROLE_USER");
    			
    			Role admin = new Role();
    			admin.setName("ROLE_ADMIN");
    			
    			roleRepository.save(user);
    			roleRepository.save(admin);
    		}
    }
    
    
    // 1
    public void saveWithUserRole(User user) {
        user.setPassword(bcrypt.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_USER"));
        userRepository.save(user);
    }
     
     // 2 
    public void saveUserWithAdminRole(User user) {
        user.setPassword(bcrypt.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }    
    
    // 3
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    public User findByEmail(String email){
    		return userRepository.findByEmail(email);
    }
    
    public ArrayList<User> all(){
    		return (ArrayList<User>)userRepository.findAll();
    }
}