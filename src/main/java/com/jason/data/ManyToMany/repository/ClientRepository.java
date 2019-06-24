package com.jason.data.ManyToMany.repository;

import com.jason.data.ManyToMany.model.ClientDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientDO, String> {
}
