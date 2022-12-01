package com.gymoderno.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gymoderno.dto.GymodernoImcDTO;
import com.gymoderno.dto.ResponseDto;

import com.gymoderno.modelo.entity.GymodernoImcEntity;
import com.gymoderno.modelo.repository.GymodernoImcRepository;
import com.gymoderno.service.GymodernoImcService;
import com.gymoderno.service.GymodernoService;

@Service
public class GymodernoImcServiceimpl implements GymodernoImcService {
	
	@Autowired
    GymodernoImcRepository gymodernoImcRepository;
	
	@Override
	public ResponseDto saveFormImc(GymodernoImcDTO gymodernoImcDTO){
		System.out.print("saveForm-------"+ gymodernoImcDTO);
		GymodernoImcEntity gymodernoImcEntity = new GymodernoImcEntity();
		ResponseDto responseDto = new ResponseDto();
		BeanUtils.copyProperties(gymodernoImcDTO,gymodernoImcEntity);
		
		//insercion de la fecha
        java.util.Date now = new java.util.Date();
        Date nowSql = new java.sql.Date(now.getTime());
        gymodernoImcEntity.setFecha_inscripcion(nowSql);
        
        try {
            gymodernoImcRepository.save(gymodernoImcEntity);
            responseDto.setMensaje("Guardado");
            responseDto.setCodigo(0);
        }catch (Exception e){
            e.printStackTrace();
            responseDto.setCodigo(1);
            responseDto.setMensaje("Error Guardando" + e.toString());
        }
		
        return responseDto;
	}

}
