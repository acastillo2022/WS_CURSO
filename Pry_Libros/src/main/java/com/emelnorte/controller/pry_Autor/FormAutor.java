package com.emelnorte.controller.pry_Autor;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.emelnorte.model.entities.pyr_Libros.CrsAutor;
import com.emelnorte.model.entities.pyr_Libros.CrsLibro;
import com.emelnorte.model.modulo.pry_Libros.ManagerCrsAutor;
import com.emelnorte.model.modulo.pry_Libros.ManagerCrsLibro;

@ManagedBean
@SessionScoped
public class FormAutor {

private CrsAutor obsCrsAutor;
	
	@EJB
	private ManagerCrsAutor managerCrsAutor;
	
	public FormAutor() {
		
	}
	
	public void inicializarAutor() {
		obsCrsAutor= new CrsAutor();	
	}
	
	public void ingresarAutor() {
		try {
			managerCrsAutor.insertarAutor(obsCrsAutor);	
		} catch (Exception e) {
			System.out.println("Eror:" + e.getMessage());
		}
}

	public CrsAutor getObCrsAutor() {
		return obsCrsAutor;
	}

	public void setObCrsAutor(CrsAutor obsCrsAutor) {
		this.obsCrsAutor = obsCrsAutor;
	}

}
	
	



