package com.grngoenterprise.microserviceevents.repositories;

import com.grngoenterprise.microserviceevents.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository <Subscription,Long> {

}
