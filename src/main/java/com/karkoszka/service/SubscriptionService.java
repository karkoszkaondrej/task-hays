package com.karkoszka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karkoszka.model.Subscription;
import com.karkoszka.repository.SubscriptionRepository;

@Service
public class SubscriptionService {
    
    @Autowired
    SubscriptionRepository subscriptionRepository;

    // getting a specific record
    public Subscription getSubscriptionById(int id) {
        return subscriptionRepository.findById(id).get();
    }

    public void saveOrUpdate(Subscription student) {
        subscriptionRepository.save(student);
    }
}
