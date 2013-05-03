package com.wonders.zjyzgl.chartered.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.wonders.zjyzgl.chartered.repository.CharteredRepository;

@Service
public class CharteredService {
	@Inject
	private CharteredRepository charterRepository;
}
