package com.ciyama.wsmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ciyama.wsmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	

}
