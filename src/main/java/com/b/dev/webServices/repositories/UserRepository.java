package com.b.dev.webServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.dev.webServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
