package com.emelnorte.model.modulo.pry_Libros;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.emelenorte.model.dao.pyr_Libros.ManagerDAOLibro;
import com.emelnorte.model.entities.pyr_Libros.CrsLibro;

/**
 * Session Bean implementation class ManagerCrsLibro
 */
@Stateless
@LocalBean
public class ManagerCrsLibro {
	
	@EJB
	ManagerDAOLibro managerDAOLibro;

    /**
     * Default constructor. 
     */
    public ManagerCrsLibro() {
        // TODO Auto-generated constructor stub
    }
    
    public void insertarLibro(CrsLibro objLibro) throws Exception{
    	managerDAOLibro.insertar(objLibro);
    }
}
