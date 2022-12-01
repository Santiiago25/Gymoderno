package com.gymoderno.dto;

import java.io.Serializable;
import java.util.Date;

public class GymodernoImcDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Date fecha_inscripcion;
	private int peso_actual;
	private String diagnostico;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "GymodernoImcDTO [fecha_inscripcion=" + fecha_inscripcion + ", peso_actual=" + peso_actual
				+ ", diagnostico=" + diagnostico + ", num_identificacion=" + num_identificacion + "]";
	}
    

}
