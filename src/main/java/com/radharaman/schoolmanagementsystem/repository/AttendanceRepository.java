package com.radharaman.schoolmanagementsystem.repository;

import com.radharaman.schoolmanagementsystem.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findByClassNameAndDate(String className, String date);
}
