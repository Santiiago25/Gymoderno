package com.gymoderno.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymoderno.modelo.entity.GymodernoImcEntity;

@Repository
public interface GymodernoImcRepository extends JpaRepository<GymodernoImcEntity, Long>{

}
