package com.wonders.zjyzgl.controller

import javax.inject.Inject

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

import com.wonders.zjyzgl.core.controller.AbstractBaseController
import com.wonders.zjyzgl.core.repository.MyRepository
import com.wonders.zjyzgl.entity.User
import com.wonders.zjyzgl.repository.UserRepository

@Controller
@RequestMapping("users")
class UserController extends AbstractBaseController<User, Long> {
	
	@Inject
	private UserRepository userRepository

	@Override
	MyRepository<User, Long> getRepository() {
		userRepository
	}

}
