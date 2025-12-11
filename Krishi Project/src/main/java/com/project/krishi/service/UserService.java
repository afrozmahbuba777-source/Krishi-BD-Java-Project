package com.project.krishi.service;

import com.project.krishi.model.User;
import com.project.krishi.repository.UserRepository;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User save(User user) {
        return userRepository.save(user);
    }
    public List<User> getAll() {
        return userRepository.findAll();

    }
    public boolean validateUser(String email, String password) {
        // Example of hardcoded validation (replace with actual DB validation logic)
        return "user@example.com".equals(email) && "password123".equals(password);
    }
}
