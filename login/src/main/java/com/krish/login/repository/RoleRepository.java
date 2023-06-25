package com.krish.login.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.krish.login.model.ERole;
import com.krish.login.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
