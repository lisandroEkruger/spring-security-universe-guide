package com.app.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.persistence.entity.RoleEntity;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Long> {

    List<RoleEntity> findRoleEntitiesByRoleEnumIn(List<String> roleNames);
}
