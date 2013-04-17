package com.wonders.zjyzgl.repository

import static org.junit.Assert.fail

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

import org.junit.Before
import org.junit.Test
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import com.wonders.zjyzgl.core.repository.MyRepositoryFactoryBean;

public class UserRepositoryTest {
	
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory('zjyzgl-core')
	
	private EntityManager entityManager
	
	private UserRepository userRepository
	
	@Before
	public void setUp() {
		entityManager = entityManagerFactory.createEntityManager()
		
		RepositoryFactorySupport factory = new MyRepositoryFactoryBean().createRepositoryFactory(entityManager)
		userRepository = factory.getRepository(UserRepository.class);
	}

	@Test
	public final void testFindAllMapPageable() {
		userRepository.findAll([:], new PageRequest(1, 10))
	}

}
