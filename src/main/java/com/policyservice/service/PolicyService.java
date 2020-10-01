package com.policyservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policyservice.model.Customer;
import com.policyservice.model.Policy;
import com.policyservice.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	PolicyRepository policyRepository;

	public Policy createPolicy(Policy policy) {
		Customer customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		policyRepository.save(policy);
		return policy;
	}

	public List<Policy> getPolicies() {
		return policyRepository.findAll();
	}

}
