package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	/**
	 * will look for username column in the table (magic)
	 */
	User findByUsername(String username);
	User findByEmail(String email);
}
