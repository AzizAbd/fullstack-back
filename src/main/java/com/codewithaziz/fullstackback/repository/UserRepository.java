package com.codewithaziz.fullstackback.repository;

import com.codewithaziz.fullstackback.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
