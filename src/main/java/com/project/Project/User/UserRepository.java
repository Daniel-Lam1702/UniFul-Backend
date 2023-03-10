package com.project.Project.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT s FROM User s WHERE s.username = ?1")
    Optional<User> findUserByUsername(String username);
    @Query("Select s FROM User s WHERE s.email = ?1")
    Optional<User> findUserByEmail(String email);

}
