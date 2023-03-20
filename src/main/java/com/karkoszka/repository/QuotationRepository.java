package com.karkoszka.repository;

import org.springframework.data.repository.CrudRepository;

import com.karkoszka.model.Quotation;

public interface QuotationRepository extends CrudRepository<Quotation, Integer> {
    
}
