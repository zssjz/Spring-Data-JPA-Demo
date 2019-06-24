package com.jason.data.ManyToOne.repository;

import com.jason.data.ManyToOne.model.NationDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationRepository extends JpaRepository<NationDO, String> {
}
