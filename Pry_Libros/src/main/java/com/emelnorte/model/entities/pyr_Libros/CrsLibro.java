package com.emelnorte.model.entities.pyr_Libros;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CRS_LIBRO database table.
 * 
 */
@Entity
@Table(name="CRS_LIBRO")
@NamedQuery(name="CrsLibro.findAll", query="SELECT c FROM CrsLibro c")
public class CrsLibro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String isbn;

	private String descrpcion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_PUBLICACION")
	private Date fechaPublicacion;

	private BigDecimal precio;

	private String titulo;

	public CrsLibro() {
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDescrpcion() {
		return this.descrpcion;
	}

	public void setDescrpcion(String descrpcion) {
		this.descrpcion = descrpcion;
	}

	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}