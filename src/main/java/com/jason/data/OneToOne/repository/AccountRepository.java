package com.jason.data.OneToOne.repository;

import com.jason.data.OneToOne.model.AccountDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountDO, String> {
}
