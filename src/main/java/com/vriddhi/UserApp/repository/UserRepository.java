// src/main/java/com/vriddhi/UserApp/repository/UserRepository.java
package com.vriddhi.UserApp.repository;

import com.vriddhi.UserApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}