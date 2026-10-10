package com.radharaman.schoolmanagementsystem.config;

import com.radharaman.schoolmanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        long adminCount = userRepository.count();
        System.out.println("✅ School Management System Initialized. Total registered users in database: " + adminCount);
        System.out.println("ℹ️ Up to 2 Admin slots (1st Admin & 2nd Principal) are available for registration.");
    }
}
