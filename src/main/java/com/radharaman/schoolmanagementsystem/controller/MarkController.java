package com.radharaman.schoolmanagementsystem.controller;

import com.radharaman.schoolmanagementsystem.entity.Mark;
import com.radharaman.schoolmanagementsystem.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marks")
@CrossOrigin(origins = "*")
public class MarkController {

    @Autowired
    private MarkRepository markRepository;

    @GetMapping
    public List<Mark> getAllMarks() {
        return markRepository.findAll();
    }

    @GetMapping("/student/{rollNumber}")
    public List<Mark> getMarksByStudent(@PathVariable Long rollNumber) {
        return markRepository.findByRollNumber(rollNumber);
    }

    @PostMapping
    public Mark saveMark(@RequestBody Mark mark) {
        return markRepository.save(mark);
    }
}
