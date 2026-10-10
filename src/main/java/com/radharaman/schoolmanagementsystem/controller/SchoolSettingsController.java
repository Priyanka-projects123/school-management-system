package com.radharaman.schoolmanagementsystem.controller;

import com.radharaman.schoolmanagementsystem.entity.SchoolSettings;
import com.radharaman.schoolmanagementsystem.repository.SchoolSettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/settings")
@CrossOrigin(origins = "*")
public class SchoolSettingsController {

    @Autowired
    private SchoolSettingsRepository schoolSettingsRepository;

    @GetMapping
    public ResponseEntity<SchoolSettings> getSettings() {
        List<SchoolSettings> list = schoolSettingsRepository.findAll();
        if (list.isEmpty()) {
            SchoolSettings defaultSettings = new SchoolSettings(
                "Radha Raman Education Institute",
                "Sirasana, Degana, Nagaur, Rajasthan",
                "+91 98765 43210",
                "Super Administrator",
                "admin@radharaman.edu",
                "en"
            );
            return ResponseEntity.ok(schoolSettingsRepository.save(defaultSettings));
        }
        return ResponseEntity.ok(list.get(0));
    }

    @PostMapping
    public SchoolSettings updateSettings(@RequestBody SchoolSettings settings) {
        List<SchoolSettings> list = schoolSettingsRepository.findAll();
        if (!list.isEmpty()) {
            settings.setId(list.get(0).getId());
        }
        return schoolSettingsRepository.save(settings);
    }
}
