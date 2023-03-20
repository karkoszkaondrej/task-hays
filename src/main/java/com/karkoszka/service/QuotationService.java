package com.karkoszka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karkoszka.model.Quotation;
import com.karkoszka.repository.QuotationRepository;

@Service
public class QuotationService {
    
    @Autowired
    QuotationRepository quotationRepository;

    public void saveOrUpdate(Quotation student) {
        quotationRepository.save(student);
    }
}
