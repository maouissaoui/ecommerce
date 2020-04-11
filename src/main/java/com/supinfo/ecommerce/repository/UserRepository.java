package com.supinfo.ecommerce.repository;

import com.supinfo.ecommerce.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository <T extends User> extends CrudRepository<T, Long> {
}
