package com.gymoderno.dto;


public class GymodernoBuscarDTO {
	
	private static final long serialVersionUID = 1L;
    private String numDoc;   
    private int altura;


	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "GymodernoBuscarDTO [numDoc=" + numDoc + ", altura=" + altura + "]";
	}

	
    
}
