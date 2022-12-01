package com.gymoderno.dto;

import java.io.Serializable;
import java.util.Date;

public class GymodernoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
    private String num_identificacion;
    private String nombres;
    private String apellidos;
    private String email;
    private String celular;
    private int altura;
    private Date fecha_inscripcion;
    


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNum_identificacion() {
        return num_identificacion;
    }

    public void setNum_identificacion(String num_identificacion) {
        this.num_identificacion = num_identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

	@Override
	public String toString() {
		return "GymodernoDTO [num_identificacion=" + num_identificacion + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", email=" + email + ", celular=" + celular + ", altura=" + altura
				+ ", fecha_inscripcion=" + fecha_inscripcion + "]";
	}
    

}
