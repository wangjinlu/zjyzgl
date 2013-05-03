package com.wonders.zjyzgl.apply.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.wonders.zjyzgl.apply.repository.ApplyRepository;

@Service
public class ApplyService {
	@Inject
	private ApplyRepository applyRepository;
}
