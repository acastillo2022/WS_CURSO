package com.emelnorte.controller.pry_Libros;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.emelnorte.model.entities.pyr_Libros.CrsLibro;
import com.emelnorte.model.modulo.pry_Libros.ManagerCrsLibro;

@ManagedBean
@SessionScoped
public class FormLibro {
	
	private CrsLibro obCrsLibro;
	
	@EJB
	private ManagerCrsLibro managerCrsLibro;
	
	public FormLibro() {
		
	}
	
	public void inicializarLibro() {
		obCrsLibro= new CrsLibro();	
	}
	
	public void ingresarLibro() {
		try {
			managerCrsLibro.insertarLibro(obCrsLibro);	
		} catch (Exception e) {
			System.out.println("Eror:" + e.getMessage());
		}
}

	public CrsLibro getObCrsLibro() {
		return obCrsLibro;
	}

	public void setObCrsLibro(CrsLibro obCrsLibro) {
		this.obCrsLibro = obCrsLibro;
	}

}