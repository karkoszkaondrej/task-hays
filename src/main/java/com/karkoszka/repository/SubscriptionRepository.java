package com.karkoszka.repository;

import org.springframework.data.repository.CrudRepository;

import com.karkoszka.model.Subscription;

public interface SubscriptionRepository extends CrudRepository<Subscription, Integer> {
    
}
