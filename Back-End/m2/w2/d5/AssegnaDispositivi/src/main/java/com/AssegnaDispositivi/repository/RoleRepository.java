package com.AssegnaDispositivi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AssegnaDispositivi.entity.ERole;
import com.AssegnaDispositivi.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
