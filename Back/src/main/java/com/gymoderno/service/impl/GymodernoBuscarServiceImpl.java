package com.gymoderno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymoderno.dto.GymodernoBuscarDTO;
import com.gymoderno.modelo.entity.GymodernoBuscarEntity;
import com.gymoderno.modelo.repository.GymodernoBuscarRepository;
import com.gymoderno.service.GymodernoBuscarService;
@Service
public class GymodernoBuscarServiceImpl implements GymodernoBuscarService{

	@Autowired
	GymodernoBuscarRepository gymodernoBuscarRepository;
	@Override
	public GymodernoBuscarDTO encontrarDoc(GymodernoBuscarDTO cliente) {
		
		GymodernoBuscarDTO clienteEncontrado = null;
		List<GymodernoBuscarEntity> listPersonas = gymodernoBuscarRepository.findBynumDoc(cliente.getNumDoc());
		
		System.out.print("------------------"+listPersonas);
		for (GymodernoBuscarEntity next: listPersonas) {
			if (next.getNumDoc().equals(cliente.getNumDoc())){
				clienteEncontrado= cliente;	
				clienteEncontrado.setAltura(listPersonas.get(0).getAltura());
			}
			
		}
		return clienteEncontrado;
	}

}
