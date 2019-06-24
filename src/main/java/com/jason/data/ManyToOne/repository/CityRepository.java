package com.jason.data.ManyToOne.repository;

import com.jason.data.ManyToOne.model.CityDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityDO, String> {
}
