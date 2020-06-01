package com.supinfo.ecommerce.repository;

import com.supinfo.ecommerce.model.Client;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository <T extends Client> extends MongoRepository<T, ObjectId> {
}
