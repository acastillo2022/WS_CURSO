package com.emelnorte.model.modulo.pry_Libros;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.emelenorte.model.dao.pyr_Libros.ManagerDAOLibro;
import com.emelnorte.model.entities.pyr_Libros.CrsAutor;



@Stateless
@LocalBean
public class ManagerCrsAutor {

	
	@EJB
	ManagerDAOLibro managerDAOLibro;
	
	 public ManagerCrsAutor() {
	    }
	
	
	public void insertarAutor(CrsAutor objLAutor)throws Exception{
    	managerDAOLibro.insertar(objLAutor); 
		
	}

}
