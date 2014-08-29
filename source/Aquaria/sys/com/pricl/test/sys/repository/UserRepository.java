package com.pricl.test.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricl.test.sys.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
