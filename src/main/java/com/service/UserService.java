package com.service;

import com.model.User;
import com.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


 // Service class for handling user operations.
 
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    
     // Registers a new user.
     
     
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    
     // Retrieves a user by their username.
     
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public Optional<User> getUserByEmail (String email){
    	return userRepository.findByEmail(email);
		
	}
}
