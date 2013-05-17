package com.wonders.zjyzgl.enterprise.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.wonders.zjyzgl.enterprise.repository.EterpriseRepository;

@Service
public class EterpriseService {
	@Inject
	private EterpriseRepository eterpriseRepository;
}
