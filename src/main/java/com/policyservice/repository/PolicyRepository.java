package com.policyservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.policyservice.model.Policy;

@Repository
public interface PolicyRepository extends MongoRepository<Policy,String>{

}
