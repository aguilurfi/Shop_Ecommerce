package com.Shop_Ecommerce.model;

import java.util.Date;

public class Orden {

	//ATRIBUTOS DE LA CLASE ORDEN
	
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private double total;

	
	
	
	//CREAMOS EL CONSTRUCTOR POR DEFECTO
	
	public Orden() {
		
	}


	//CREAMOS EL CONSTRUCTOR POR PARAMETROS
	
	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}


	
	//CREAMOS LOS METODOS GETER AND SETER
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Date getFechaRecibida() {
		return fechaRecibida;
	}


	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}

	//CREAMOS EL METODO TO STRING
	
	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}
	
	
	
	
	
	
}
