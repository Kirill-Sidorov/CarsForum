package com.sidorov.carsforum.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ForumUserRepository extends JpaRepository<ForumUser, Integer> {
    Optional<ForumUser> findById(Integer id);
}
