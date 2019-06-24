package com.jason.data.OneToOne.repository;

import com.jason.data.OneToOne.model.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDO, String> {
}
