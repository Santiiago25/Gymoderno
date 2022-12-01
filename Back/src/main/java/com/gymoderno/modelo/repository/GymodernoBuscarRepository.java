package com.gymoderno.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymoderno.modelo.entity.GymodernoBuscarEntity;

@Repository
public interface GymodernoBuscarRepository extends JpaRepository<GymodernoBuscarEntity, Long> {
	List<GymodernoBuscarEntity> findBynumDoc(String num_identificacion);
}
