package com.radharaman.schoolmanagementsystem.controller;

import com.radharaman.schoolmanagementsystem.entity.ReportCard;
import com.radharaman.schoolmanagementsystem.repository.ReportCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/report-cards")
@CrossOrigin(origins = "*")
public class ReportCardController {

    @Autowired
    private ReportCardRepository reportCardRepository;

    @GetMapping
    public List<ReportCard> getAllReportCards() {
        return reportCardRepository.findAll();
    }

    @PostMapping
    public ReportCard saveReportCard(@RequestBody ReportCard reportCard) {
        return reportCardRepository.save(reportCard);
    }
}
