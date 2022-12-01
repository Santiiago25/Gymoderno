package com.gymoderno.service.impl;

import com.gymoderno.dto.GymodernoDTO;
import com.gymoderno.dto.ResponseDto;
import com.gymoderno.modelo.entity.GymodernoEntity;
import com.gymoderno.modelo.repository.GymodernoRepository;
import com.gymoderno.service.GymodernoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GymodernoServiceimpl implements GymodernoService {

    @Autowired
    GymodernoRepository gymodernoRepository;

    @Override
    public ResponseDto saveForm(GymodernoDTO gymodernoDTO){
        GymodernoEntity gymodernoEntity = new GymodernoEntity();
        ResponseDto responseDto = new ResponseDto();
        BeanUtils.copyProperties(gymodernoDTO,gymodernoEntity);

        //insercion de la fecha
        java.util.Date now = new java.util.Date();
        Date nowSql = new java.sql.Date(now.getTime());
        gymodernoEntity.setFecha_inscripcion(nowSql);

        try {
            gymodernoRepository.save(gymodernoEntity);
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
