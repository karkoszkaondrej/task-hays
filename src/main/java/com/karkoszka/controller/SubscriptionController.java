package com.karkoszka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karkoszka.model.Subscription;
import com.karkoszka.service.SubscriptionService;

@RestController
public class SubscriptionController {
    
    @Autowired
    SubscriptionService subscriptionService;

    // creating a get mapping that retrieves the detail of a specific subscription
    @GetMapping("/subscription/{id}")
    private Subscription getSubscription(@PathVariable("id") int id) {
        return subscriptionService.getSubscriptionById(id);
    }

    // creating post mapping that post the subscription detail in the database
    @PostMapping("/subscription")
    private int saveSubscription(@RequestBody Subscription subscription) {
        subscriptionService.saveOrUpdate(subscription);
        return subscription.getId();
    }
}
