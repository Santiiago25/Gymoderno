package com.gymoderno.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymoderno.modelo.entity.GymodernoEntity;

@Repository
public interface GymodernoRepository extends JpaRepository<GymodernoEntity, Long> {

}
