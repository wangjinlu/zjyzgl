package com.wonders.zjyzgl.service

import javax.inject.Inject

import org.springframework.stereotype.Service

import com.wonders.zjyzgl.repository.UserRepository

@Service
class UserService {
	
	@Inject
	private UserRepository userRepository

}
