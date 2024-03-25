package com.NetworkMarketing.NetworkMarketing.repositories;

import com.NetworkMarketing.NetworkMarketing.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Override
    Optional<User> findById(Long aLong);

    Optional<User> findByEmail(String email);
}
