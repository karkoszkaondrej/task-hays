package com.karkoszka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karkoszka.model.Quotation;
import com.karkoszka.service.QuotationService;

@RestController
public class QuotationController {
    
    @Autowired
    QuotationService quotationService;

    // creating post mapping that post the quotation detail in the database
    @PostMapping("/quotation")
    private int saveQuotation(@RequestBody Quotation quotation) {
        quotationService.saveOrUpdate(quotation);
        return quotation.getId();
    }
}
