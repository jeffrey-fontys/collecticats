package com.collecticats.userservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends MongoRepository<User, String> {

  User findByAuthId(@Param("authId") String id);

}
