package com.psIleon.psileon.Repository;

import org.springframework.data.repository.CrudRepository;

import com.psIleon.psileon.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
