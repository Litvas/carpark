package com.litvas.carpark.repository;

import com.litvas.carpark.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(String role);

}
