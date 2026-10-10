package com.radharaman.schoolmanagementsystem.controller;

import com.radharaman.schoolmanagementsystem.entity.Attendance;
import com.radharaman.schoolmanagementsystem.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendance")
@CrossOrigin(origins = "*")
public class AttendanceController {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @GetMapping
    public List<Attendance> getAttendance(@RequestParam(required = false) String className, @RequestParam(required = false) String date) {
        if (className != null && date != null) {
            return attendanceRepository.findByClassNameAndDate(className, date);
        }
        return attendanceRepository.findAll();
    }

    @PostMapping
    public List<Attendance> saveAttendance(@RequestBody List<Attendance> attendanceList) {
        return attendanceRepository.saveAll(attendanceList);
    }
}
