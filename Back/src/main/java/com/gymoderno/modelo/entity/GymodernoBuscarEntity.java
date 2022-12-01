package com.gymoderno.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prueba_clientes")
public class GymodernoBuscarEntity {

	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "ALTURA")
	private int altura;
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Column(name = "NUM_IDENTIFICACION")
    private String numDoc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	@Override
	public String toString() {
		return "GymodernoBuscarEntity [id=" + id + ", altura=" + altura + ", numDoc=" + numDoc + "]";
	}

	
	
	
	
	
}
