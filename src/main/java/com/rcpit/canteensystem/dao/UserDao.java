package com.rcpit.canteensystem.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.rcpit.canteensystem.model.User;

@Component("userDao")
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public Long insertUser(User user) {
		return (Long) this.hibernateTemplate.save(user);
	}

	@Transactional
	public void deleteUser(long userId) {
		User user = this.hibernateTemplate.get(User.class, userId);
		if (user != null) {
			this.hibernateTemplate.delete(user);
		}
	}

	public User getUser(long userId) {
		return this.hibernateTemplate.get(User.class, userId);
	}

	public List<User> getAllUsers() {
		return this.hibernateTemplate.loadAll(User.class);
	}
}