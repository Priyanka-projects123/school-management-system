package com.radharaman.schoolmanagementsystem.repository;

import com.radharaman.schoolmanagementsystem.entity.FeePayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeePaymentRepository extends JpaRepository<FeePayment, Long> {
}
