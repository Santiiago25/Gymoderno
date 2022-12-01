package com.gymoderno.controller;

import com.gymoderno.dto.GymodernoBuscarDTO;
import com.gymoderno.dto.GymodernoDTO;
import com.gymoderno.dto.GymodernoImcDTO;
import com.gymoderno.dto.ResponseDto;
import com.gymoderno.service.GymodernoBuscarService;
import com.gymoderno.service.GymodernoImcService;
import com.gymoderno.service.GymodernoService;
import com.gymoderno.service.impl.GymodernoServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/gymoderno")

public class GymodernoController {

    @Autowired
    GymodernoService service;
    

    @PostMapping("/savecliente")
    public ResponseEntity<ResponseDto> saveCliente(@RequestBody GymodernoDTO gymodernoDTO, BindingResult bd){
        ResponseDto responseDto = new ResponseDto();
        System.out.print("AQUIIII-------"+ gymodernoDTO);

        if (bd.hasErrors()){
            responseDto.setMensaje(bd.getFieldError().toString());
            return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
        }

        try {
            responseDto = service.saveForm(gymodernoDTO);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);

        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(responseDto, HttpStatus.UNAUTHORIZED);
        }

    }
    @Autowired
    GymodernoBuscarService serviceBuscar;
    @PostMapping("/buscarcliente")
    public ResponseEntity<GymodernoBuscarDTO> listaId(@RequestBody GymodernoBuscarDTO gymodernoBuscarDTO){
    	GymodernoBuscarDTO clienteEncontrado = serviceBuscar.encontrarDoc(gymodernoBuscarDTO);
        try {
            return new ResponseEntity<>(clienteEncontrado, null != clienteEncontrado ?  HttpStatus.OK : HttpStatus.NO_CONTENT );
            
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(clienteEncontrado, HttpStatus.NOT_FOUND);
        }

    }
    
    @Autowired
    GymodernoImcService serviceImc;
    

    @PostMapping("/saveimc")
    public ResponseEntity<ResponseDto> saveImc(@RequestBody GymodernoImcDTO gymodernoImcDTO, BindingResult bd){
        ResponseDto responseDto = new ResponseDto();
        System.out.print("AQUIIII-------"+ gymodernoImcDTO);

        if (bd.hasErrors()){
            responseDto.setMensaje(bd.getFieldError().toString());
            return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
        }

        try {
            responseDto = serviceImc.saveFormImc(gymodernoImcDTO);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);

        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(responseDto, HttpStatus.UNAUTHORIZED);
        }

    }

    }



