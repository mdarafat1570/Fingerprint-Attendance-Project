package com.example.attendance.controller;

import com.example.attendance.model.Student;
import com.example.attendance.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/mark")
    public String markAttendance(@RequestParam String fingerprintId) {
        Student student = studentRepository.findByFingerprintId(fingerprintId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setDaysPresent(student.getDaysPresent() + 1);
        studentRepository.save(student);
        return "Attendance marked for " + student.getName();
    }
}
