package com.wonders.zjyzgl.entity;

import static javax.persistence.TemporalType.DATE;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "sec_user")
public class User extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 8754573634208751281L;

	private String username;

	private String password;

	private int age;

	@Temporal(DATE)
	private Date birthday;

	private boolean enabled;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
