package com.jason.data.ManyToMany.repository;

import com.jason.data.ManyToMany.model.BankDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankDO, String> {
}
