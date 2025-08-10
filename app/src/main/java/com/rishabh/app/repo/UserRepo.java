package com.rishabh.app.repo;

import com.rishabh.app.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserType,Integer> {
}
