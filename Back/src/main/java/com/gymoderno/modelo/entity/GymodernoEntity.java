package com.gymoderno.modelo.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "prueba_clientes")
public class GymodernoEntity {
	
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
	

	@Column(name = "NUM_IDENTIFICACION",length = 22)
    private String num_identificacion;

    @Column(name = "NOMBRES", length = 50)
    private String nombres;

    @Column(name = "APELLIDOS", length = 50)
    private String apellidos;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "CELULAR", length = 10)
    private String celular;

    @Column(name = "ALTURA")
    private int altura;

    @Column(name = "FECHA_INSCRIPCION")
    private Date fecha_inscripcion;

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
		return "GymodernoEntity [id=" + id + ", num_identificacion=" + num_identificacion + ", nombres=" + nombres
				+ ", apellidos=" + apellidos + ", email=" + email + ", celular=" + celular + ", altura=" + altura
				+ ", fecha_inscripcion=" + fecha_inscripcion + "]";
	}
    
}
