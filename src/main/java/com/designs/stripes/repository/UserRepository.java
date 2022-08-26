package com.designs.stripes.repository;

import com.designs.stripes.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}