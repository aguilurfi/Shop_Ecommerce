package com.Shop_Ecommerce.model;

public class Producto {

	
	
	private String id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private double precio;
	private int cantidad;
	
	
	
	
	//CREAMOS EL CONSTRUCTOR POR DEFECTO
	public Producto() {
		
	}





	//CREAMOS EL CONSTRUCTOR POR PARAMETROS
	public Producto(String id, String nombre, String descripcion, String imagen, double precio, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}




    // CREAMOS LOS METODOS GETER AND SETER
	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getDescripcion() {
		return descripcion;
	}





	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}





	public String getImagen() {
		return imagen;
	}





	public void setImagen(String imagen) {
		this.imagen = imagen;
	}





	public double getPrecio() {
		return precio;
	}





	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public int getCantidad() {
		return cantidad;
	}





	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}




	//CREAMOS EL METODO TO STRING
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
	
	
}
