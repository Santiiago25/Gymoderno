package com.gymoderno.modelo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prueba_imc")
public class GymodernoImcEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_GENERATE")
	@Column(name = "ID")
	private Long id;
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "FECHA_INSCRIPCION")
    private Date fecha_inscripcion;
	
	@Column(name = "PESO_ACTUAL")
    private int peso_actual;
	
	@Column(name = "DIAGNOSTICO")
    private String diagnostico;
	
	@Column(name = "NUM_IDENTIFICACION",length = 22)
    private String num_identificacion;

	public Date getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(Date fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}

	public int getPeso_actual() {
		return peso_actual;
	}

	public void setPeso_actual(int peso_actual) {
		this.peso_actual = peso_actual;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getNum_identificacion() {
		return num_identificacion;
	}

	public void setNum_identificacion(String num_identificacion) {
		this.num_identificacion = num_identificacion;
	}

	@Override
	public String toString() {
		return "GymodernoImcEntity [id=" + id + ", fecha_inscripcion=" + fecha_inscripcion + ", peso_actual="
				+ peso_actual + ", diagnostico=" + diagnostico + ", num_identificacion=" + num_identificacion + "]";
	}
	
	

}
