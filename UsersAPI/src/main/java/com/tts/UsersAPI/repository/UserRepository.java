package com.tts.UsersAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.UsersAPI.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
			User findByState(String state);
			User findByFirstName(String FIRSTNAME);
			User findByLastName(String LASTNAME);
}
