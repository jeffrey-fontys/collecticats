package com.collecticats.catservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@DataMongoTest
class CatRepositoryTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    private Cat exampleCat;

    @BeforeEach
    void bootstrapTestDataWithMongoRepository() {
        Cat cat = new Cat();
        cat.setName("Cat 1");
        cat.setDescription("Cat 1 description");
        this.exampleCat = cat;
        mongoTemplate.insert(cat);

        // ...
    }

    @AfterEach
    void cleanUpDatabase() {
            mongoTemplate.getDb().drop();
    }

    @Test
    void retrieveCat() {
        Query query = new Query(); 
        query.addCriteria(Criteria.where("name").is("Cat 1"));
        Cat retrievedCat = mongoTemplate.find(query, Cat.class).get(0);
        assertEquals(exampleCat.getName(), retrievedCat.getName());
    }
}
