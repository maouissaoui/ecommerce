package com.supinfo.ecommerce.repository;

import com.supinfo.ecommerce.model.Client;
import com.supinfo.ecommerce.model.Produit;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository<T extends Produit> extends MongoRepository<T, ObjectId> {
}
