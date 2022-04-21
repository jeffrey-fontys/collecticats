package com.collecticats.catservice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface CatRepository extends MongoRepository<Cat, String> {

    List<Cat> findByOwner(@Param("owner") String owner);

}
