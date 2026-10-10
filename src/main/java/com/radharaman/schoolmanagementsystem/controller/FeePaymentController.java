package com.radharaman.schoolmanagementsystem.controller;

import com.radharaman.schoolmanagementsystem.entity.FeePayment;
import com.radharaman.schoolmanagementsystem.repository.FeePaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fees")
@CrossOrigin(origins = "*")
public class FeePaymentController {

    @Autowired
    private FeePaymentRepository feePaymentRepository;

    @GetMapping
    public List<FeePayment> getAllFees() {
        return feePaymentRepository.findAll();
    }

    @PostMapping
    public FeePayment recordPayment(@RequestBody FeePayment feePayment) {
        return feePaymentRepository.save(feePayment);
    }
}
